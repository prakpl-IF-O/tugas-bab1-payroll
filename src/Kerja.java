/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Kerja {
    private String Nama;
    private String nik;
    private double gaji;
    private double tunjangan;
    private double bonus;
    private double denda;
    private double denda1;
    private double denda2;
    private double denda3;
    private double tanggal;
    private double bulan;
    private double tahun;
    private double jammsk;
    private double jamplg;
    private double total;
    
    public void setKaryawan (String n,String a, double y, double o){
        Nama = n;
        nik=a;
        gaji=o;
        tunjangan=o;
    }
    public void setAbsensi(double t,double b, double x, double j, double i){
        tanggal=t;
        bulan=b;
        tahun=x;
        jammsk=j;
        jamplg=i;
        
    }
    public void getBonus(){
        if ( tanggal==15){
        if ( jamplg > 17){
        bonus=(jamplg-17) * 50;   
    } else {
            bonus=0;
        }
    }  else if ( tanggal==16||tanggal==17){
            bonus=(jamplg-jammsk)*50;
        } 
        }
    public void getDenda (){
        if ( tanggal==15){
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
