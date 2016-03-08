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
    public String nama;
    public int nik;
    int gaji;
    int bonus;
    int denda;
    int tunjangan;
    

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
    public int getDenda() {
        return denda;
    }
    public int getTunjangan() {
        return tunjangan;
    }

   
    }    


