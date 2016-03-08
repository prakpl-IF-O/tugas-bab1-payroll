
import java.text.ParseException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws ParseException {
        ArrayList<DataKaryawan> data = new ArrayList();
        ArrayList<Absensi> absen = new ArrayList();
        ArrayList<PerhitunganGaji> hitung = new ArrayList();
        DataKaryawan k1 = new DataKaryawan(101, "Paijo", 900, 200, 150, 75);
        DataKaryawan k2 = new DataKaryawan(102, "Lulu", 875, 200, 100, 100);
        DataKaryawan k3 = new DataKaryawan(103, "Lala", 1000, 350, 200, 125);
        Absensi a1 = new Absensi(101, "15/01/2016", 8, 00, 17, 00);
        Absensi a2 = new Absensi(102, "15/01/2016", 8, 00, 15, 00);
        Absensi a3 = new Absensi(103, "15/01/2016", 8, 00, 17, 00);
        PerhitunganGaji g1 = new PerhitunganGaji(101);
        g1.hitungPokok(k1);
        g1.hitungTambah(a1, k1);
        g1.hitungTotal();
        a1.absen("16/01/2016", 8, 0, 18, 30);
        g1.hitungTambah(a1, k1);
        g1.hitungTotal();
        PerhitunganGaji g2 = new PerhitunganGaji(102);
        g2.hitungPokok(k2);
        g2.hitungTambah(a2, k2);
        g2.hitungTotal();
        PerhitunganGaji g3 = new PerhitunganGaji(103);
        g3.hitungPokok(k3);
        g3.hitungTambah(a3, k3);
        g3.hitungTotal();
        showData(k1,g1);
        showData(k2,g2);
        showData(k3,g3);
    }

    public static void showData(DataKaryawan K, PerhitunganGaji G) {
        System.out.printf("%-7d%-7s%7d%7d%7d%7d%7d\n",K.getNik(),K.getNama(),K.getGaji(),K.getTunjangan(),
                K.getBonus(),K.getDenda(),G.getTotal());
    }
}
