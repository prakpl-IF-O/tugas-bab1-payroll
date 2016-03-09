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
public class DataPegawai {
    private String nama;
    private short nik;
    private short gaji;
    private short tunjangan;
    private short bonus;
    private short denda;
    public void Setnama(String n){
        nama=n;}
    public String Getnama(){
        return nama;}
    public void Setnik(short k){
        nik=k;}
    public short Getnik(){
        return nik;}
    public void Setgaji(short g){
        gaji=g;}
    public short Getgaji(){
        return gaji;}
    public void Settunjangan(short t){
        tunjangan=t;}
    public short Gettunjangan(){
        return tunjangan;}
    public void Setbonus(short b){
        bonus=b;}
    public short Getbonus(){
        return bonus;}
    public void Setdenda (short d){
        denda=d;}
    public short Getdenda(){
        return denda;}
    public int gajitotal(){
        return (gaji+tunjangan+bonus)-denda;}
    
    
}


