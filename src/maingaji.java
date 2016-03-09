
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
import java.util.ArrayList;
public class maingaji {
    public static void main(String[] args) {
        double buruhh;// ganti paijo
        ArrayList <database> datker= new ArrayList();//array list
        database hum=new database(101,"2016-01-15",08.00,17.00);
        database hum1=new database(101,"2016-01-16",08.00,18.30);
        database hum2=new database(102,"2016-01-15",08.00,15.00);
        database hum3=new database(103,"2016-01-15",08.00,17.00);
        ArrayList<DataPekerja>data= new ArrayList();// array list
        DataPekerja kar1= new DataPekerja(101,"paijo",900,200,150,75);
        DataPekerja kar2=new DataPekerja(102,"lulu",875,200,100,100);
        DataPekerja kar3=new DataPekerja(102,"lala",1000,350,200,125);
        
        kalender z= new kalender();
        kalender x= new kalender();
        kalender c= new kalender();
        kalender v= new kalender();
        
        hitunggaji buruh=new hitunggaji();
        hitunggaji buruh1=new hitunggaji();
        hitunggaji buruh2=new hitunggaji();
        hitunggaji buruh3=new hitunggaji();
        
        
        
        buruh.hitunggaji(z.ceheckingcalender("2016-01-15"),hum.getJam_in(),hum.getJam_out(),kar1.getBonus(),kar1.getDenda(),kar1.getGaji(),kar1.getTunjangan());
        buruh1.hitunggaji(x.ceheckingcalender("2016-01-16"),hum1.getJam_in(),hum1.getJam_out(),kar1.getBonus(),kar1.getDenda(),kar1.getGaji(),kar1.getTunjangan());
        buruh2.hitunggaji(c.ceheckingcalender("2016-01-15"),hum2.getJam_in(),hum2.getJam_out(),kar2.getBonus(),kar2.getDenda(),kar2.getGaji(),kar2.getTunjangan());
        buruh3.hitunggaji(v.ceheckingcalender("2016-01-15"),hum3.getJam_in(),hum3.getJam_out(),kar3.getBonus(),kar3.getDenda(),kar3.getGaji(),kar3.getTunjangan());
        buruhh=buruh.gettotalgaji()+buruh1.gettotalgaji();
        
        System.out.println("========================HASIL GAJI KARYAWAN========================");
        System.out.println("|NIK\t|Nama\t|gaji\t|tunjangan\t|bonus\t|denda\ttotal gaji");
        System.out.println("====================================================================");
        kar1.Tampilkan();
        System.out.printf("%.0f\n",buruhh);
        System.out.println("====================================================================");
        kar2.Tampilkan();
        System.out.printf("%.0f\n",buruh2.gettotalgaji());
        System.out.println("====================================================================");
        kar3.Tampilkan();
        System.out.printf("%.0f\n",buruh3.gettotalgaji());
        System.out.println("====================================================================");
    }
    
}

