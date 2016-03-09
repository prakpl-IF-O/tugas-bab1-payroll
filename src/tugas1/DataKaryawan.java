package tugas1;

public class DataKaryawan {

    private String nik, nama;
    private int gajiPegawai, tunjanganPegawai, bonus, denda;
    double bonusPegawai[] = new double[2];
    double dendaPegawai[] = new double[2];
    String tanggalPegawai[] = new String[2];
    double jamMasuk[] = new double[2];
    double jamKeluar[] = new double[2];
    double jamBolos;
    double jamTelat;
    double totalGaji[] = new double[2];
    double jamBonus;
    double jumlahGaji;
    double gajiKeseluruhan;

    public void displayMessage1() {
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Gaji Pokok\t: " + gajiPegawai);
        System.out.println("Tunjangan\t: " + tunjanganPegawai);
        System.out.println("----------------------------------------------------");
        System.out.println("Tanggal Kerja\t: " + tanggalPegawai[0]);
        System.out.println("Bonus\t\t: " + bonusPegawai[0]);
        System.out.println("Denda\t\t: " + dendaPegawai[0]);
        System.out.println("Total Gaji\t: " + totalGaji[0]);
    }

    public void displayMessage2() {
        System.out.println("----------------------------------------------------");
        System.out.println("Tanggal Kerja\t: " + tanggalPegawai[1]);
        System.out.println("Bonus\t\t: " + bonusPegawai[1]);
        System.out.println("Denda\t\t: " + dendaPegawai[1]);
        System.out.println("Total Gaji\t: " + totalGaji[1]);
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }

    public void setNik(String n) {
        nik = n;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setGaji(int x) {
        gajiPegawai = x;
    }

    public void setTunjangan(int x) {
        tunjanganPegawai = x;
    }

    public void jamMasuk(double[] x) {
        jamMasuk = x;
    }

    public void jamKeluar(double[] x) {
        jamKeluar = x;
    }

    public void setBonus(int x) {
        bonus = x;
    }

    public void setDenda(int x) {
        denda = x;
    }

    public void setJamMasuk(double[] x) {
        jamMasuk = x;
    }

    public void dendaPegawai1(double x, double y, int z) {
        if (x > 8) {
            jamTelat = x - 8;
        } else {
            jamTelat = 0;
        }
        if (y < 17) {
            jamBolos = 17 - y;
        } else {
            jamBolos = 0;
        }
        dendaPegawai[0] = jamTelat + jamBolos * z;
    }

    public void dendaPegawai2(double x, double y, int z) {
        if (x > 8) {
            jamTelat = x - 8;
        } else {
            jamTelat = 0;
        }
        if (y < 17) {
            jamBolos = 17 - y;
        } else {
            jamBolos = 0;
        }
        dendaPegawai[1] = jamTelat + jamBolos * z;
    }

    public void bonusPegawai1(double x, int z) {
        if (x > 17) {
            jamBonus = x - 17;
        } else {
            jamBonus = 0;
        }
        bonusPegawai[0] = jamBonus * z;
    }

    public void bonusPegawai2(double x, int z) {
        if (x > 17) {
            jamBonus = x - 17;
        } else {
            jamBonus = 0;
        }
        bonusPegawai[1] = jamBonus * z;
    }

    public int getGaji() {
        return gajiPegawai;
    }

    public int getTunjangan() {
        return tunjanganPegawai;
    }

    public void totalGajiK() {
        if (tanggalPegawai[1] == null) {
            totalGaji[0] = (gajiPegawai + tunjanganPegawai) + bonusPegawai[0] - dendaPegawai[0];
        } else {
            totalGaji[1] = ((gajiPegawai + tunjanganPegawai)) + bonusPegawai[1] - dendaPegawai[1];
        }
    }

    public void gajiKeseluruhan() {
        gajiKeseluruhan = totalGaji[0] + totalGaji[1];
    }

    public void displayMessage() {
        System.out.println("----------------------------------------------------");
        System.out.println("Total Gaji\t: " + gajiKeseluruhan);

    }
}
