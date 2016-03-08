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
  import java.text.ParseException;
    public class PerhitunganGaji {

    public int nik;
    public int gajiPokok;
    public double gajiTambah;
    public int totalGaji;
    public PerhitunganGaji(int g){
    nik = g;
    }

    public void GajiPokok(DataPegawai p) {
        gajiPokok = p.getGaji() + p.getTunjangan();
        totalGaji = gajiPokok;
    }
    public void Total_Gaji() {
        totalGaji = totalGaji + (int) gajiTambah;
        
    }

    public int getTotal() {
        return totalGaji;
    }
    
}
