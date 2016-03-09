public class Tugas1 {
    public int nik;
    public String nama;
    public double gaji,tunjangan,bonus,denda,jumdenda,jumlah;
    public int Omasuk = 8;
    public int Okeluar = 17;
    double [] bon = new double [2];
    public String [] tanggal = new String[2];
    double []masukjam = new double [2];
    double []bolosjam = new double [2];
    double []keluarjam = new double [2];
    double []telatjam = new double [2];
    double []jum = new double [2];
    
 
    public static void main(String[]args) {
        
        Tugas1 Ka = new Tugas1();      
        Ka.setNik(101);
        Ka.setNama("Paijo");
        Ka.setGaji(900);
        Ka.setTunjangan(200);
        Ka.setBonus(150);
        Ka.setDenda(75);
        Ka.tanggal[0]= "2016-01-15";
        Ka.masukjam[0]= 8;
        Ka.keluarjam[0]= 17;
        Ka.ketentuanJam1(Ka.masukjam[0],Ka.keluarjam[0],Ka.bonus);
        Ka.tanggal[1]= "2016-01-16";
        Ka.masukjam[1]= 8;
        Ka.keluarjam[1]= 18.5;
        Ka.ketentuanJam2(Ka.masukjam[1],Ka.keluarjam[1],Ka.bonus);
        Ka.jumDenda1(Ka.getDenda());
        Ka.jumDenda2(Ka.getDenda());
        Ka.jumlahdenda();
        Ka.jumlah();
        Ka.InformasiKaryawan();
                
        Tugas1 Kb = new Tugas1();
        Kb.setNik(102);
        Kb.setNama("Lulu");
        Kb.setGaji(875);
        Kb.setTunjangan(200);
        Kb.setBonus(100);
        Kb.setDenda(100);
        Kb.tanggal[0]= "2016-01-15";
        Kb.masukjam[0]= 8;
        Kb.keluarjam[0]= 15;
        Kb.ketentuanJam1(Kb.masukjam[0],Kb.keluarjam[0],Kb.bonus);
        Kb.tanggal[1]= null;
        Kb.masukjam[1]= 8;
        Kb.keluarjam[1]= 17;
        Kb.ketentuanJam2(Kb.masukjam[1],Kb.keluarjam[1],Kb.bonus);
        Kb.jumDenda1(Kb.getDenda());
        Kb.jumDenda2(Kb.getDenda());
        Kb.jumlahdenda();
        Kb.jumlah();
        Kb.InformasiKaryawan();
        
        Tugas1 Kc = new Tugas1();
        Kc.setNik(103);
        Kc.setNama("Lala");
        Kc.setGaji(1000);
        Kc.setTunjangan(350);
        Kc.setBonus(200);
        Kc.setDenda(125);
        Kc.tanggal[0]= "2016-01-15";
        Kc.masukjam[0]= 8;
        Kc.keluarjam[0]=17;
        Kc.ketentuanJam1(Kc.masukjam[0],Kc.keluarjam[0],Kc.bonus);
        Kc.tanggal[1]= null;
        Kc.masukjam[1]= 8;
        Kc.keluarjam[1]= 17;
        Kc.ketentuanJam2(Kc.masukjam[1],Kc.keluarjam[1],Kc.bonus);
        Kc.jumDenda1(Kc.getDenda());
        Kc.jumDenda2(Kc.getDenda());
        Kc.jumlahdenda();
        Kc.jumlah();
        Kc.InformasiKaryawan();
    
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
    public void ketentuanJam1 (double s,double x,double z) {
        if (s>8){
            telatjam[0] = (double) (s-8);
        }
        if (x<17){
            bolosjam[0] =(double) (17-x);
      } else {
            bon [0]= (x-17)*z;
        }
    }
    public void ketentuanJam2 (double s,double x,double z) {
     
        if (s>8){
            telatjam[1] = (double) (s-8);
        }
        if (x<17){
            bolosjam[1] =(double) (17-x);
      } else {
            bon [1] = (x-17)*z;
        }
    }
    
    public void jumDenda1(double z){
    jum[0] = (telatjam[0]+bolosjam[0])*z;  
    }
    public void jumDenda2(double z){
    jum[1] = (telatjam[1]+bolosjam[1])*z;  
    }
    public void jumlahdenda(){
        jumdenda = jum[0]+jum[1];
    }
    public void jumlah (){
        if (tanggal[1]==null) {
            System.out.println(nama+" Berkerja selama 1 Hari (gaji+tunjangan) ");
        jumlah = (gaji + tunjangan)+ bon[0] + bon[1] - jumdenda;
        }else{
            System.out.println(nama+" Berkerja selama 2 Hari (gaji+tunjangan*2)");
         jumlah = (gaji+tunjangan)*2+ bon[0] + bon[1] - jumdenda;   
        }  
    } 
          
    public void InformasiKaryawan(){
        System.out.printf("%-10s : %d\n","NIK",nik);
        System.out.printf("%-10s : %s\n","Nama",nama);
        System.out.printf("%-10s : Rp. %.3f\n","Gaji",gaji);
        System.out.printf("%-10s : Rp. %.3f\n","Tunjangan",tunjangan);
        System.out.printf("%-10s : %s \n","Tanggal 1",tanggal[0]);
        System.out.printf("%-10s : Rp. %.3f\n","Bonus 1",bon[0]);
        System.out.printf("%-10s : Rp.-%.3f\n","Denda 1",jum[0]);
        System.out.printf("%-10s : %s \n","Tanggal 2",tanggal[1]);
        System.out.printf("%-10s : Rp. %.3f\n","Bonus 2",bon[1]);
        System.out.printf("%-10s : Rp.-%.3f\n","Denda 2",jum[1]);
        System.out.println("-------------------------- +");
        System.out.printf("%-10s : Rp. %.3f\n\n","Jumlah gajih",jumlah);    
}
}
