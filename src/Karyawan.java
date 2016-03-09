
import java.util.Calendar;

public class Karyawan {

    Calendar Tanggal = Calendar.getInstance();
    Calendar Tanggal1 = Calendar.getInstance();
    public String Nik;
    public String Nama;
    public int Gaji;
    public int Tunjangan;
    public int Bonus;
    public int Denda;
    public int Total_Gaji;
    public int Jam_masuk;
    public int Jam_pulang;

    public void setTanggalMasuk(){
        Tanggal1.set(2016, 0, 15, 8, 00);
    }
    public void setTanggal1(int t, int b, int h, int j, int m) {
        Tanggal.set(t, b, h, j, m);

    }

    public void setNama(String n) {
        Nama = n;
    }

    public void setNIK(String i) {
        Nik = i;
    }

    public void setGaji(int g) {
        Gaji = g;
    }

    public void setTunjangan(int t) {
        Tunjangan = t;
    }

    public void setBonus(int b) {
        Bonus = b;
    }

    public void setDenda(int d) {
        Denda = d;
    }

    public void setTotalgaji() {
        Total_Gaji = (Gaji + Tunjangan + Bonus) - Denda;
    }
    public void displayMessage() {
        System.out.println("Nik,Nama,Gaji,Tunjangan,Bonus,Denda,Total Gaji");
        System.out.println(Nik + "," + Nama + "," + Gaji + "," + Tunjangan + "," + Bonus + "," + Denda + "," + Total_Gaji);
        
        System.out.println(Tanggal1.getTime());
        System.out.println(Tanggal.getTime());
    }

}
