
import java.text.ParseException;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws ParseException {
        ArrayList<DataKaryawan> data = new ArrayList();
        ArrayList<Absensi> absen = new ArrayList();
        ArrayList<PerhitunganGaji> hitung = new ArrayList();
        DataKaryawan k1 = new DataKaryawan(101, "Paijo", 900, 200, 150, 75);
        data.add(k1);
        DataKaryawan k2 = new DataKaryawan(102, "Lulu", 875, 200, 100, 100);
        data.add(k2);
        DataKaryawan k3 = new DataKaryawan(103, "Lala", 1000, 350, 200, 125);  
        data.add(k3);
        Absensi a1 = new Absensi(101, "15/01/2016", 8, 00, 17, 00);
        absen.add(a1);
        Absensi a11 = new Absensi(101, "16/01/2016", 8, 00, 18, 30);
        absen.add(a11);
        Absensi a2 = new Absensi(102, "15/01/2016", 8, 00, 15, 00);
        absen.add(a2);
        Absensi a3 = new Absensi(103, "15/01/2016", 8, 00, 17, 00);
        absen.add(a3);
        PerhitunganGaji g1 = new PerhitunganGaji(101);
        hitung.add(g1);
        PerhitunganGaji g2 = new PerhitunganGaji(102);
        hitung.add(g2);
        PerhitunganGaji g3 = new PerhitunganGaji(103);
        hitung.add(g3);
        for (DataKaryawan K : data) {
            for (Absensi A : absen) {
                if (K.getNik() == A.getNik()) {
                    for (PerhitunganGaji H : hitung) {
                        if (K.getNik() == H.getNik()) {
                            H.hitungPokok(K);
                            H.hitungTambah(A, K);
                            H.hitungTotal();

                        }
                    }
                }
            }
        }
        int i = 0;
        System.out.printf("%-7s%-7s%7s%13s%10s%10s%10s\n","NIK","Nama","Gaji","Tunjangan","Bonus","Denda","Total");
        for (DataKaryawan K : data) {
            showData(K, hitung.get(i));
            i++;
        }

    }

    public static void showData(DataKaryawan K, PerhitunganGaji G) {
        System.out.printf("%-7d%-7s%7d%10d%12d%11d%10d\n", K.getNik(), K.getNama(), K.getGaji(), K.getTunjangan(),
                K.getBonus(), K.getDenda(), G.getTotal());
    }
}
