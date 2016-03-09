import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        double paijo;
        //CH=cek hari
        carihari a= new carihari();
        carihari b= new carihari();
        carihari c= new carihari();
        carihari d= new carihari();
                Gaji a1=new Gaji();
                Gaji a2=new Gaji();
                Gaji a3=new Gaji();
                Gaji a4=new Gaji();
        
        ArrayList <data_karyawan> data= new ArrayList();
        data_karyawan kar1= new data_karyawan(101,"paijo",900,200,150,75);
        data_karyawan kar2=new data_karyawan(102,"lulu",875,200,100,100);
        data_karyawan kar3=new data_karyawan(102,"lulu",1000,350,200,125);
        
        ArrayList <daker> datker= new ArrayList();
        daker aA=new daker(101,"2016-01-15",08.00,17.00);
        
        daker bB=new daker(101,"2016-01-16",08.00,18.30);
        
        daker cC=new daker(102,"2016-01-15",08.00,15.00);
        
        daker dD=new daker(103,"2016-01-15",08.00,17.00);
        
        a1.Gaji(a.CH("2016-01-15"),aA.getJamker(),aA.getJampul(),kar1.getBonus(),kar1.getDenda(),kar1.getGaji(),kar1.getTunjangan());
        a2.Gaji(b.CH("2016-01-16"),bB.getJamker(),bB.getJampul(),kar1.getBonus(),kar1.getDenda(),kar1.getGaji(),kar1.getTunjangan());
        a3.Gaji(c.CH("2016-01-15"),cC.getJamker(),cC.getJampul(),kar2.getBonus(),kar2.getDenda(),kar2.getGaji(),kar2.getTunjangan());
        a4.Gaji(d.CH("2016-01-15"),dD.getJamker(),dD.getJampul(),kar3.getBonus(),kar3.getDenda(),kar3.getGaji(),kar3.getTunjangan());
        paijo=a1.getTotalGaji()+a2.getTotalGaji();
        
        System.out.println("NIK\tNama\tgaji\ttunjangan\tbonus\tdenda\ttotal gaji");
        kar1.TampilAkhir();
        System.out.printf("%.0f\n",paijo);
        kar2.TampilAkhir();
        System.out.printf("%.0f\n",a3.getTotalGaji());
        kar3.TampilAkhir();
        System.out.printf("%.0f\n",a4.getTotalGaji()); }   }
