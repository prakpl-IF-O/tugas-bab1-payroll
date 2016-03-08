/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
public class hitunggaji {
    private String nik;
    private String nama;
    private double gaji;
    private double tunjangan;
    private double bonus;
    private double denda;
    private int tanggal;
    private int jamin;
    private int jamout; 
    
    public void setnik(String s){
    nik = s;
    }
    public void setnama(String n){
    nama = n;
    }
    public void setgaji(double g){
    gaji = g;
    }
    public void settunjangan(double t){
    tunjangan = t;
    }
    public void setbonus(double b){
    bonus = b;
    }
    public void setdenda(double d){
    denda = d;
    }
    public void settanggal(int tgl){
    tanggal = tgl;
    }
    public void setjamin(int in){
    jamin = in;
    }
    public void setjamout(int out){
    jamout = out;
    }
    
}

