/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dino Keylas
 */
public class karyawan {
    private String nama;
    private int nik;
    private int gaji,tunjangan,bonus,denda;
    public karyawan( int b,String a,int c,int d, int e, int f){
    nama=a;
    nik=b;
    gaji=c;
    tunjangan=d;
    bonus=e;
    denda=f;
    }
    public String getNama() {
        return nama;
    }

    public int getNik() {
        return nik;
    }

    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }
}
