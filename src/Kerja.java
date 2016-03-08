/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Kerja {
    Scanner in = new Scanner ( System.in);
    private String Nama;
    private String nik;
    private double gaji;
    private double tunjangan;
    private double bonus;
    private double denda;
    private double denda1;
    private double denda2;
    private double denda3;
    private String tanggal;
    private double jammsk;
    private double jamplg;
    private double total;
    
    public void setKaryawan (){
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan Nama    :");
        Nama = in.nextLine();
        System.out.print("Masukan NIK     :");
        nik=in.nextLine();
        System.out.print("Gaji            :");
        gaji=in.nextDouble();
        System.out.print("Tunjangan       :");
        tunjangan=in.nextDouble();
    }
    public void setAbsensi(){
        Scanner in= new Scanner (System.in);
        System.out.print("Masukan Tanggal :");
        tanggal=in.nextLine();
        System.out.print("Jam Masuk       :");
        jammsk=in.nextDouble();
        System.out.print("Jam Pulang      :");
        jamplg=in.nextDouble();
        
    } 
    public void getBonus(){
        if ( jamplg > 17){
        bonus=(jamplg-17) * 50;   
    } else {
            bonus=0;
        }
    }
    public void getDenda (){
        denda1= jammsk-8;
        denda2= 17 - jamplg;
        if (jamplg < 17 && jammsk > 8){
            denda=(denda1+denda2) * 50;
        } 
        else if ( jammsk<8&&jamplg < 17) {
          denda=denda2*50;  
        } 
        else if ( jammsk > 8 && jamplg > 17){
            denda=denda1*50 ;
        } 
        else if (jammsk==8&&jamplg<17){
            denda=denda2*50;
        }
        else if ( jammsk>8&&jamplg==17){
            denda=denda1*50;
        } else {
            denda=0;
        }
    }
    public void getTotal(){
        total=( gaji+tunjangan+bonus)-denda;
        
    }
    public void display (){
        System.out.println("Nama Karyawan   :"+ Nama);
        System.out.println("Nik Karyawan    :"+ nik);
        System.out.println("Gaji Karyawan   :"+ gaji);
        System.out.println("Tunjangan       :"+tunjangan);
        System.out.println("Bonus           :"+bonus);
        System.out.println("Denda           :"+denda);
        System.out.println("Total Gaji      :"+total);
    }
    
}
