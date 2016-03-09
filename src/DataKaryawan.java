
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

    public int getDenda() {
        return denda;
    }

}
