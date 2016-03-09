/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Aditya
 */
public class DataPegawai {
    private String nama;
    private int nik;
    public double gaji;
    public double tunjangan;
    public double bonus;
    public double denda;
    public double jumdenda;
    public double jumlah;
    public int masuk = 8;
    public int keluar = 17;
    double [] bon = new double [2];
    public String [] tanggal = new String[2];
    double []masukjam = new double [2];
    double []bolosjam = new double [2];
    double []keluarjam = new double [2];
    double []telatjam = new double [2];
    double []jum = new double [2];
   
    
    public DataPegawai (int ni, String na, int ga,int t, int b, int de) {
        nik = ni;
        nama = na;
        gaji = ga;
        tunjangan = t;
        bonus = b;
        denda = de;
        
    }

    public DataPegawai() {
        
    }
    public void ketentuanJammasuk1 (double p,double q,double r) {
        if (p>8){
            telatjam[0] = (double) (p-8);
        }
        if (q<17){
            bolosjam[0] =(double) (17-q);
      } else {
            bon [0]= (q-17)*r;
        }
    }
    public void ketentuanJammasuk2 (double p,double x,double r) {
     
        if (p>8){
            telatjam[1] = (double) (p-8);
        }
        if (x<17){
            bolosjam[1] =(double) (17-x);
      } else {
            bon [1] = (x-17)*r;
        }
    }
    public void jumlah (){
        if (tanggal[1]==null) {
        jumlah = (gaji + tunjangan)+ bon[0] + bon[1] - jumdenda;
        }else{
         jumlah = (gaji+tunjangan)*2+ bon[0] + bon[1] - jumdenda;   
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

    public void setNik(int ni) {
        nik = ni;
    }

    public void setNama(String na) {
        nama = na;
    }

    public void setGaji(int ga) {
        gaji = ga;
    }

    public void setTunjangan(int t) {
        tunjangan = t;
    }

    public void setBonus(int b) {
        bonus = b;
    }

    public void setDenda(int de) {
        denda = de;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }
    public double getDenda() {
        return denda;
    }
    public double getTunjangan() {
        return tunjangan;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        return bonus;
    }
    public void TampilkanData() {
        System.out.println("NIK : " +nik);
        System.out.println("Nama :" +nama);
        System.out.println("Gaji : Rp. " +gaji +"00");
        System.out.println("Tunjangan : Rp. " +tunjangan +"00");
        System.out.println("Hari Ke 1 : " +tanggal[0]);
        System.out.println("Bonus 1 : " +bon[0] +"00");
        System.out.println("Denda 1 : " +jum[0] +"00");
        System.out.println("Hari Ke 2 : " +tanggal[1]);
        System.out.println("Bonus 2 : " +bon[1] +"00");
        System.out.println("Denda 2 : " +jum[1] +"00");
        System.out.println("===================== +");
        System.out.printf("%-10s : Rp. %.3f\n\n","Jumlah gaji yang Di dapat",jumlah);    

    }
}   

