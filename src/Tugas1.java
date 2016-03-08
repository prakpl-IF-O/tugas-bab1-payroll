import java.util.Date;
import java.text.SimpleDateFormat;
public class Tugas1 {
    public int nik;
    public String nama;
    public double gaji,tunjangan,bonus,denda,jumdenda,jumlah;
    public int Omasuk = 8;
    public int Okeluar = 17;
    public String jam;
    
 
    public static void main(String[]args) {
        
        Tugas1 Ka = new Tugas1();      
        Ka.setNik(101);
        Ka.setNama("Paijo");
        Ka.setGaji(900);
        Ka.setTunjangan(200);
        Ka.setBonus(150);
        Ka.setDenda(75);
        
        Tugas1 Kb = new Tugas1();
        Kb.setNik(102);
        Kb.setNama("Lulu");
        Kb.setGaji(875);
        Kb.setTunjangan(200);
        Kb.setBonus(100);
        Kb.setDenda(100);
        
        Tugas1 Kc = new Tugas1();
        Kc.setNik(103);
        Kc.setNama("Lala");
        Kc.setGaji(1000);
        Kc.setTunjangan(350);
        Kc.setBonus(200);
        Kc.setDenda(125);
        
    
    }
    public void setNik (int s){
        nik = s;
    }
    public void setNama(String s){
        nama = s;
    }
    public void setGaji(double s){
        gaji = s;
    }
    public void setTunjangan(double s){
        tunjangan = s;
    }
    public void setBonus(double s){
        bonus = s;
    }
    public void setDenda(double s){
        denda = s;
    }
    public void setTanggal (String s){
        masuk = s;   
    }    
    public void (byte s) {
        
        
        
        
    }
   
    public void jumDenda(int x,double z){
    jumdenda = x*z;  
    }
    public void jumlah (double s){
        jumlah = (gaji + tunjangan+ bonus) - jumdenda;
    }
    
    
    
            
    public void InformasiKaryawan(){
        System.out.printf("%-10s : %d\n","NIK",nik);
        System.out.printf("%-10s : %s\n","Nama",nama);
        System.out.printf("%-10s : Rp. %f\n","Gaji",gaji);
        System.out.printf("%-10s : Rp. %s\n","Tunjangan",tunjangan);
        System.out.printf("%-10s : Rp. %s\n","Bonus",bonus);
        System.out.printf("%-10s : Rp.-%s\n","Denda",jumdenda);
        System.out.println("-------------------------- +");
        System.out.printf("%-10s : Rp. %s","Jumlah",jumlah);    
}
}