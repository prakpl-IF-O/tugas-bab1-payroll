
import java.util.Calendar;

public class Payroll {

    Calendar kal = Calendar.getInstance();
    private String nama, hariString;
    private int nik, gaji, tunjangan, bonus, totalbonus, denda, totalgaji, jamMasuk, jamPulang, menitMasuk, menitPulang, hari, tanggal, tahun, bulan;

    public void setHari(int thn, int bln, int tgl) {
        tahun = thn;
        bulan = bln;
        tanggal = tgl;
        kal.set(thn, bln - 1, tgl - 1);
        hari = kal.get(Calendar.DAY_OF_WEEK);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setJamMasuk(int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public void setJamPulang(int jamPulang) {
        this.jamPulang = jamPulang;
    }

    public void setMenitMasuk(int menitMasuk) {
        this.menitMasuk = menitMasuk;
    }

    public void setMenitPulang(int menitPulang) {
        this.menitPulang = menitPulang;
    }

    public void setBonusDenda() {
        if (hari == 6 || hari == 7) {
            bonus = 0;
            denda = 0;
            if (menitPulang >= menitMasuk) {
                bonus = (jamPulang - jamMasuk) * 100;
                totalbonus += bonus;
            } else {
                bonus = ((jamPulang - jamMasuk) - 1) * 100;
                totalbonus += bonus;
            }
        } else if (jamMasuk <= 8) {
            bonus = 0;
            denda = 0;
            if (jamPulang >= 17) {
                bonus = (jamPulang - 17) * 50;
                totalbonus += bonus;
            } else {
                denda = 50;
                totalbonus -= denda;
            }
        } else {
            bonus = 0;
            denda = 0;
            denda = (jamMasuk - 8) * 50;
            if (jamPulang >= 17) {
                bonus = (jamPulang - 17) * 50;
                totalbonus += bonus - denda;
            } else {
                denda += 50;
                totalbonus -= denda;
            }
        }
    }

    public void setTotalgaji() {
        totalgaji = (gaji + tunjangan) + totalbonus;
    }

    public int getTotalgaji() {
        return totalgaji;
    }

    public String hariString() {
        switch (hari) {
            case 1:
                return hariString = "Senin";
            case 2:
                return hariString = "Selasa";
            case 3:
                return hariString = "Rabu";
            case 4:
                return hariString = "Kamis";
            case 5:
                return hariString = "Jum'at";
            case 6:
                return hariString = "Sabtu";
            case 7:
                return hariString = "Minggu";
            default:
                return "null";
        }
    }

    public void displayData() {
        System.out.println("");
        System.out.println("~~~Data Karyawan~~~");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Gaji\t\t: " + gaji + "000");
        System.out.println("Tunjangan\t: " + tunjangan + "000");
    }

    public void displayGaji() {
        System.out.printf("Hari\t\t: %s ,%d-%d-%d\n", hariString(), tanggal, bulan, tahun);
        System.out.printf("Jam\t\t: %02d:%02d s/d %02d:%02d\n", jamMasuk, menitMasuk, jamPulang, menitPulang);
        System.out.println("Bonus\t\t: " + bonus + "000");
        System.out.println("Denda\t\t: " + denda + "000");
        System.out.println("----------------------------------");
    }
}
