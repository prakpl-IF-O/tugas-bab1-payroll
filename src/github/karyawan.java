package github;
public class karyawan {
    private String nama;
    private String nik;
    private int gaji;
    private int tunjangan;
    private int bonus;
    private int denda;

    public void karyawan(String Nama,String NIK,int Gaji, int Tunjangan, int Bonus, int Denda){
                nama=Nama;
                nik=NIK;
                gaji=Gaji;
                tunjangan=Tunjangan;
                bonus=Bonus;
                denda=Denda;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
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
