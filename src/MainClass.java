
import java.text.ParseException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws ParseException {
        ArrayList<DataKaryawan> data = new ArrayList();
        ArrayList<Absensi> absen = new ArrayList();
        ArrayList<PerhitunganGaji> hitung = new ArrayList();
        DataKaryawan k1 = new DataKaryawan(101, "Paijo", 900, 200, 150, 75);
        Absensi a1 = new Absensi(101, "15/01/2016", 8, 00, 17, 00);
        PerhitunganGaji g1 = new PerhitunganGaji(101);
        g1.hitungPokok(k1);
        g1.hitungTambah(a1, k1);
        g1.hitungTotal();
        a1.absen("16/01/2016", 8, 0, 18, 30);
        g1.hitungTambah(a1, k1);
        g1.hitungTotal();
        System.out.println(g1.getTotal());
    }
}
