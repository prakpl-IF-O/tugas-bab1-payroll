
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class karyawan {

    public static int totalgaji, tanggal, tanggal1, jm, jp, fin, find, y, t, nik, gaji, tunjangan, bonus, denda;
    public static String nama;
    public static double jp1;
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();

    public void setNik(int i) {
        nik = i;
    }

    public void setJp1(double d) {
        if (jp1 > 17.00) {
        }

    }

    public void setTanggal(int i) {
        tanggal = i;
    }

    public void setTanggal1(int i) {
        tanggal1 = i;
    }

    public void setJm(int i) {
        jm = i;
    }

    public void setJp(int i) {
        jp = i;
    }

    public void setGaji(int i) {
        gaji = i;
        Totalgaji();
    }

    public void setTunjangan(int i) {
        tunjangan = i;
        Totalgaji();
    }

    public void setBonus(int i) {
        if (jp1 > 17) {
        }
        bonus = i;
        Totalgaji();
    }

    public void setDenda(int i) {
        if (jm > 8) {
        }
        denda = i;

        if (jp < 17) {
        }
        denda = i;
        Totalgaji();
    }

    public void setNama(String s) {
        nama = s;
    }

    private void Totalgaji() {
        totalgaji = (gaji + tunjangan + bonus) - denda;
    }

    //calendar
    public void Calendar(int a, int s, int z, int x, int c, int d, int f) {
        cal1.set(a, s, z, x, c, 0);
        cal2.set(a, s, z, d, f, 0);
        fin = d;
        this.y = x;
        find = c;
        this.t = f;

    }

    public void displayMessage() {
        System.out.println(nik+","+nama+","+gaji+","+tunjangan+","+bonus+","+denda+","+totalgaji);
            }

}
