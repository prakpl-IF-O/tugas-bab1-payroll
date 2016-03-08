
public class DataKaryawan {

    private int nik;
    private String nama;
    private int gaji;
    private int tunjangan;
    private int bonus;
    private int denda;

    public DataKaryawan(int n, String na, int g, int t, int b, int d) {
        nik = n;
        nama = na;
        gaji = g;
        tunjangan = t;
        bonus = b;
        denda = d;
    }

    public DataKaryawan() {

    }

    public void setNik(int n) {
        nik = n;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setGaji(int g) {
        gaji = g;
    }

    public void setTunjangan(int t) {
        tunjangan = t;
    }

    public void setBonus(int b) {
        bonus = b;
    }

    public void setDenda(int d) {
        denda = d;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

}
