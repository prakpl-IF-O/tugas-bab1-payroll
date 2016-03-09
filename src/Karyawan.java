/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunka
 */
public class Karyawan {
    int nik, gaji, tunjangan, bonus, denda;
    String nama;
    
    Karyawan(int nik, String nama, int gaji, int tunjangan,int bonus, int denda){
        this.nik = nik;
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }
    
}
