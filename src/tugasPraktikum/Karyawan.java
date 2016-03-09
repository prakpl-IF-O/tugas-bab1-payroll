package tugasPraktikum;
public class Karyawan {
    private String nama;
    private short nik;
    private short gaji;
    private short denda;
    private short tunjangan;
    private short bonus;
    
    public void setNama(String a){
        nama=a;
    }
    public void setNik(short a){
        nik=a;
    }
    public void setGaji(short a){
        gaji=a;
    }
    public void setDenda(short a){
        denda=a;
    }
    public void setTunjangan(short a){
        tunjangan=a;
    }
    public void setBonus(short a){
        bonus=a;
    }
    public String getNama(){
        return nama;
    }
    public short getNik(){
        return nik;
    }
    public short getGaji(){
        return gaji;
    }
    public short getDenda(){
        return gaji;
    }
    public short getTunjangan(){
        return tunjangan;
    }
    public short getBonus(){
        return bonus;
    }
    public int totalGaji(){
        return (gaji + tunjangan + bonus) - denda;
    }
}
