
import java.text.ParseException;

public class PerhitunganGaji {

    int nik;
    int gajiPokok;
    double gajiTambah;
    int totalGaji;

    public void hitungPokok(DataKaryawan k) {
        gajiPokok = k.getGaji() + k.getTunjangan();
    }

    public void hitungTambah(Absensi a, DataKaryawan k) throws ParseException {
        a.checkLibur();
        a.checkJam();
        gajiTambah = (k.getBonus() * a.getJamT()) + (k.getDenda() * a.getJamK());
    }

    public void hitungTotal() {
        totalGaji = gajiPokok + (int) gajiTambah;
    }

    public int getTotal() {
        return totalGaji;
    }

}
