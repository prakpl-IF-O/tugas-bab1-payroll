
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
    int jm1;
    int mm1;
    int jk1;
    int mk1;
    int jm;
    int mm;
    int jk;
    int mk;

    int t;

    public void setTanggalK(int t, int b, int h, int jm1, int mm1, int jk1, int mk1) {
        Tanggal.set(t, b, h, jm1, mm1);
        Tanggal1.set(t, b, h, jk1, mk1);
        this.jm1 = jm1;
        this.mm1 = mm1;
        this.jk1 = jk1;
        this.mk1 = mk1;
        this.t = t;
    }

    public void setTanggal(int t, int b, int h, int jm, int mm, int jk, int mk) {
        Tanggal.set(t, b, h, jm, mm);
        Tanggal1.set(t, b, h, jk, mk);
        this.jm = jm;
        this.mm = mm;
        this.jk = jk;
        this.mk = mk;

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
        boolean coba = false;

        if (t == 5 || t == 6) {
            coba = true;

        } else if ((t - 5) % 7 == 0 || (t - 6) % 7 == 0) {
            coba = true;
           
        }
        if (coba == true){ 
            Bonus = Bonus * (jk1 - jm1);
            
        }
        if (jk1 > jk) {
            Bonus = Bonus * (jk1 - jk);
            if (mk1 > mk) {
                Bonus = Bonus + (Bonus/2);
            } 
        }

    }

    public void setDenda(int d) {
        Denda = d;

        if (jm1 > jm) {

            Denda = Denda * (jm1 - jm);

            if (mm1 > mm) {
                Denda = Denda + (Denda/2);
            }
        }
    }

    public void setTotalgaji() {
        Total_Gaji = (Gaji + Tunjangan + Bonus) - Denda;
    }

    public void displayMessage() {
        
        System.out.println(Nik + "," + Nama + "," + Gaji + "," + Tunjangan + "," + Bonus + "," + Denda + "," + Total_Gaji);
        
    }

    public void Waktu() {

    }

}
