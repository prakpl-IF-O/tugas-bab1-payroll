import java.util.ArrayList;
import java.util.Date;
public class Tugas1 {
    public int nik;
    public String nama;
    public double gaji,tunjangan,bonus,denda,jumlah;
    
    public static void main(String[]args){
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
        Ka.setNik(103);
        Ka.setNama("Lala");
        Ka.setGaji(1000);
        Ka.setTunjangan(350);
        Ka.setBonus(200);
        Ka.setDenda(125);
                
    
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
    public void Total(double s){
        
    }
    
    
    
            
    public void InformasiKaryawan(){
        System.out.printf("%-10s : %d\n","NIK",nik);
        System.out.printf("%-10s : %s\n","Nama",nama);
        System.out.printf("%-10s : Rp. %f\n","Gaji",gaji);
        System.out.printf("%-10s : Rp. %s\n","Nama",tunjangan);
        System.out.printf("%-10s : Rp. %s\n","Nama",bonus);
        System.out.printf("%-10s : Rp.-%s\n","Nama",denda);
        System.out.println("-------------------------- +");
        System.out.printf("%-10s : Rp. %s","Jumlah",jumlah);
        
        
        
}
}