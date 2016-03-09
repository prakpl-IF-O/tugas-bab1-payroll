package mainpayroll;
public class Karyawan {
    
    private int nik,gaji,tunjangan,bonus,denda,totalGaji;
    private String nama;
    
    Karyawan (int nik2, String nama2, int gaji2, int tunjangan2,int bonus2,int denda2){
        nik = nik2; 
        nama = nama2; 
        gaji = gaji2; 
        tunjangan = tunjangan2; 
        bonus = bonus2;
        denda = denda2;
    }
    
    public int hitBonus(){
        int Bonus = 0;
        if (nama == "Paijo"){
            Bonus = (18-8)*150;
        } else if ( nama == "Lulu"){
            Bonus = 0;
        } else if (nama == "Lala"){
            Bonus = 0;
        }
        return Bonus;
    }
    
    public int hitDenda(){
        int Denda;
        if (nama == "Lulu"){
            Denda = (17-15)*100;    
        }else {
            Denda = 0;
        }
        return Denda;
    } 

    public int totalGaji(){
       int tG = (gaji + tunjangan + hitBonus()) - hitDenda();
       return tG;
    }
    public void dataKaryawan (){
        System.out.println(nik+ "," +nama+ "," +gaji+ "," +tunjangan+ "," +bonus+ "," +denda);
    }
    
    public void tampilan(){
        System.out.println(nik+ "," +nama+ "," +gaji+ "," +tunjangan+ "," +bonus+ "," +denda+ "," +totalGaji());
    }
}
