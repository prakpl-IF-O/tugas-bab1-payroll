import java.util.Date;
import java.text.SimpleDateFormat;
public class Tugas1 {
    public int nik;
    public String nama;
    public double gaji,tunjangan,bonus,denda,jumdenda,jumlah;
    public int Omasuk = 8;
    public int Okeluar = 17;
    public String [] tanggal = new String[2];
    double []masukjam = new double [2];
    double []bolosjam = new double [2];
    double []keluarjam = new double [2];
    double []telatjam = new double [2];
    
 
    public static void main(String[]args) {
        
        Tugas1 Ka = new Tugas1();      
        Ka.setNik(101);
        Ka.setNama("Paijo");
        Ka.setGaji(900);
        Ka.setTunjangan(200);
        Ka.setBonus(150);
        Ka.setDenda(75);
        Ka.tanggal[0]= "2016-01-15";
        Ka.masukjam[0]= 8.5;
        Ka.keluarjam[0]= 17;
        Ka.ketentuanJam(Ka.masukjam[0],Ka.keluarjam[0]);
        Ka.tanggal[1]= "2016-01-16";
        Ka.masukjam[1]= 8;
        Ka.keluarjam[1]= 18;
        Ka.ketentuanJam(Ka.masukjam[1],Ka.keluarjam[1]);
        Ka.jumDenda(Ka.getDenda());
        Ka.jumlah();
        Ka.InformasiKaryawan();
                
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
    public double getDenda(){
        return denda;
    }
    public void ketentuanJam (double s,double x) {
      for (int i=0; i<telatjam.length; i++){
        if (s>8){
            telatjam[i] = (double) (s-8);
        }
        if (x<17){
            bolosjam[i] =(double) (17-x);
        }
      }
    }
    public void jumDenda(double z){
    jumdenda = telatjam[0]+bolosjam[0]+telatjam[1]+bolosjam[1]*z;  
    }
    public void jumlah (){
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