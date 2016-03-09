package tugasPraktikum;
public class Karyawan {
    private String nama;
    private int nik;
    private int gaji;
    private int denda;
    private int tunjangan;
    private int bonus;
    
    public void setNama(String a){
        nama=a;
    }
    public void setNik(int a){
        nik=a;
    }
    public void setGaji(int a){
        gaji=a;
    }
    public void setDenda(int a){
        denda=a;
    }
    public void setTunjangan(int a){
        tunjangan=a;
    }
    public void setBonus(int a){
        bonus=a;
    }
    public String getNama(){
        return nama;
    }
    public int getNik(){
        return nik;
    }
    public int getGaji(){
        return gaji;
    }
    public int getDenda(){
        return gaji;
    }
    public int getTunjangan(){
        return tunjangan;
    }
    public int getBonus(){
        return bonus;
    }
    public int totalGaji(){
        return (gaji + tunjangan + bonus) - denda;
    }
}
