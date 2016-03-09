/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
public class DataPekerja {
    private String nama;
    private int nik;
    private int gaji;
    private int tunjangan;
    private int bonus;
    private int denda;
    public DataPekerja( int nikk,String name,int uang,int bns, int bs, int dnd){
    nama=name;
    nik=nikk;
    gaji=uang;
    tunjangan=bns;
    bonus=bs;
    denda=dnd;
    }
    public String getNama() {
        return nama;}

    public int getNik() {
        return nik;}
    public int getGaji() {
        return gaji;}
    public int getTunjangan() {
        return tunjangan; }
    public int getBonus() {
        return bonus;}
    public int getDenda() {
        return denda;}
    //public void int getBonus() {
      //  return bonus;}
    //public void int getDenda() {
      //  return denda;}
    
    
    public void Tampilkan(){ 
        System.out.printf("%s%d\t%s%s\t%s%d\t%s%d\t\t%s%d\t%s%d\t",'|',nik,'|',nama,'|',gaji,'|',tunjangan,'|',bonus,'|',denda);//format benar
    }
    
}

