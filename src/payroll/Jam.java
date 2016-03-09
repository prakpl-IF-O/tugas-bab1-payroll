/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Kenank
 */
public class Jam {
    private String nama;
    private int nik;
    private String tanggal;
    private double masuk;
    private double keluar;
    private double gaji;
    private double tunjangan;
    private double bonus;
    private double denda;
    
    public Jam (int b, String tg, double m, double k){
        nik=b;
        tanggal = tg;
        masuk=m;
        keluar=k;
}
    public double Getmasuk(){
        return masuk;
    }
    public double Getkeluar(){
        return keluar;
    }
    public double Getgaji(){
        return gaji;}
    public double Gettunjangan(){
        return tunjangan;}
    public double Getbonus(){
        return bonus;}
    public double Getdenda(){
        return denda;}


public void Display(){
System.out.printf("%s%d\t%s%s\t%s%d\t%s%d\t%s%d\t",'|',nik,'|',nama,'|',gaji,'|',tunjangan,'|',bonus,'|',denda);
}}