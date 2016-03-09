
import java.text.ParseException;

public class PerhitunganGaji {

    int nik;
    int gajiPokok;
    double gajiTambah;
    int totalGaji;

    public PerhitunganGaji(int n) {
        nik = n;
    }

    public int getNik() {
        return nik;
    }

    public void hitungPokok(DataKaryawan k) {
        if (gajiPokok == 0) {
            gajiPokok = k.getGaji() + k.getTunjangan();
        }
        totalGaji = gajiPokok;
    }

    public void hitungTambah(Absensi a, DataKaryawan k) throws ParseException {
        a.checkLibur();
        a.checkJam();
        gajiTambah = (k.getBonus() * a.getJamT()) + (k.getDenda() * a.getJamK());
    }

    public void hitungTotal() {
        totalGaji = totalGaji + (int) gajiTambah;

    }

    public int getTotal() {
        return totalGaji;
    }

}
