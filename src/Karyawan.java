/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;
public class Karyawan {
    private int nik, gaji, tunj, bonus, denda, dendaMasuk, dendaKeluar, tahun, bulan, tanggal, jamMasuk, jamKeluar, 
            totalDenda, totalBonus, totalBonusDenda, totalGaji;
    private String nama;
    private boolean benarsalah;
    
    public void dataKaryawan(int a, String b, int c, int d, int e, int f){
        nik=a;
        nama=b;
        gaji=c;
        tunj=d;
        bonus=e;
        denda=f;
    }
    public void dataAbsensi(int a, int b, int c, int d, int e, boolean f){
        tahun=a;
        bulan=b;
        tanggal=c;
        jamMasuk=d;
        jamKeluar=e;
        benarsalah=f;
    }
    
    public int dendaMasuk(){
        if (benarsalah==true){
            dendaMasuk=0;
        } else {
            if (jamMasuk>8 ){
            dendaMasuk=(jamMasuk-8)*denda;
        } else if (benarsalah==true) {
            dendaMasuk=0;
        }
        }
        return dendaMasuk;
        
    }
    public int dendaKeluar(){
        if (benarsalah==false){
            if(jamKeluar<17){
            dendaKeluar=(17-jamKeluar)*denda;
            } else {
            dendaKeluar=0;
            }
        } else if (benarsalah==true) {
            dendaKeluar=0;
        }
            return dendaKeluar;
    }
    public int hitungBonus(){
        if (benarsalah==false){
            if (jamKeluar>17){
                totalBonus=(jamKeluar-17)*bonus;
            } else {
                totalBonus=0;
            }
        } else if (benarsalah==true){
            totalBonus=(jamKeluar-jamMasuk)*bonus;
        }
        return totalBonus;
    }
    
    public void tampilData(){
        System.out.println();
        System.out.println("NIK Karyawan    : "+nik);
        System.out.println("Nama Karyawan   : "+nama);
        System.out.println("Gaji            : "+gaji);
        System.out.println("Tunjangan       : "+tunj);
        System.out.println("Bonus           : "+bonus);
        System.out.println("Denda / jam     : "+denda);
    }
    public int totalGaji(){
        totalGaji=(gaji+tunj+hitungBonus())-(dendaMasuk()+dendaKeluar());
        return totalGaji;
    }
}
