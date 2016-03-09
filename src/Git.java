public class Git {
private String NIKKaryawan;
public static String NamaKaryawan;
private int  Gaji, Tunjangan, Bonus, Denda;

    public void setNIKKaryawan(String a) {
        this.NIKKaryawan = a;
    }
    public static void setNamaKaryawan(String b) {
        Git.NamaKaryawan = b;
    }
    public void setGaji(int c) {
        this.Gaji = c;
    }
    public void setTunjangan(int d) {
        this.Tunjangan = d;
    }
    public void setBonus(int e) {
        this.Bonus = e;
    }
    public void setDenda(int f) {
        this.Denda = f;
    }
    public String getNIKKaryawan() {
        return NIKKaryawan;
    }
    public static String getNamaKaryawan() {
        return NamaKaryawan;
    }
    public int getGaji() {
        return Gaji;
    }
    public int getTunjangan() {
        return Tunjangan;
    }
    public int getBonus() {
        return Bonus;
    }
    public int getDenda() {
        return Denda;
    }
    



}
