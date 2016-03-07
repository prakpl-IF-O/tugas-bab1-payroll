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
    private String tanggal;
    private double jammsk;
    private double jamplg;
    private double total;
    
    public void setKaryawan (){
        Scanner in = new Scanner (System.in);
        System.out.println("masukan nama    :");
        Nama = in.nextLine();
        System.out.println("masukan nik");
        nik=in.nextLine();
        System.out.println("gaji");
        gaji=in.nextDouble();
        System.out.println("tunjangan");
        tunjangan=in.nextDouble();
    }
    public void setAbsensi(){
        Scanner in= new Scanner (System.in);
        System.out.println("masukan tanggal");
        tanggal=in.nextLine();
        System.out.println("jam masuk");
        jammsk=in.nextDouble();
        System.out.println("jam plg");
        jamplg=in.nextDouble();
        
    }
    public void rubah (){
        jamplg=jamplg*60;
    } 
    public void getBonus(){
        bonus=(jamplg-17) * 100;   
    }
    public void getDenda (){
        denda=(jammsk-8)*50;
        if (jamplg < 17){
            denda=((jammsk - 8)+(17-jamplg)) * 50;
        } 
    }
    public void getTotal(){
        total=( gaji+tunjangan+bonus)-denda;
        
    }
    public void display (){
        System.out.println("Nama"+ Nama);
        System.out.println("Nik"+ nik);
        System.out.println("Gaaji"+ gaji);
        System.out.println("tunjangan"+tunjangan);
        System.out.println("bonus"+bonus);
        System.out.println("denda"+denda);
        System.out.println("total"+total);
    }
    
}
