public class Git {
private int NIKKaryawan;
public static String NamaKaryawan;
private int  Gaji, Tunjangan, Bonus, Denda,Total_gaji, JamMasuk, JamKeluar;

    public void setTotal_gaji(int o) {
        Total_gaji = (Gaji + Tunjangan + Bonus) - Denda;   
    }
    public void setJamMasuk(int p) {
        JamMasuk = p;
    }
    public void setJamKeluar(int k) {
        JamKeluar = k;
    }
    public void setNIKKaryawan(int a) {
        NIKKaryawan = a;
    }
    public static void setNamaKaryawan(String b) {
        NamaKaryawan = b;
    }
    public void setGaji(int c) {
        Gaji = c;
    }
    public void setTunjangan(int d) {
        Tunjangan = d;
    }
    public void setBonus(int e) {
        Bonus = e;
    }
    public void setDenda(int f) {
        Denda = f;
    }
    public void Display(){
        System.out.println(NIKKaryawan+"," + NamaKaryawan+","+ Gaji+"," + Tunjangan+"," + Bonus+","
        + Denda+"," + Total_gaji );
    }


}
