
import java.util.Calendar;

public class Payroll {

    Calendar kal = Calendar.getInstance();
    private String nama;
    private int nik, gaji, tunjangan, bonus, denda, totalgaji, jam, menit, hari;

    public void setHari(int thn, int bln, int hr) {
        kal.set(thn, bln-1, hr);
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

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setBonusDenda(int jam, int menit, String hari) {
        
    }

    public void setTotalgaji() {
        totalgaji = (gaji + tunjangan + bonus) - denda;
    }

}
