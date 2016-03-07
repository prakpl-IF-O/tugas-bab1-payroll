/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

/**
 *
 * @author dwiyan
 */
public class Karyawan {

    private int a = 0;
    private String data[][];
    private double keuangan[][];

    public void setKaryawan(int a) {
        data = new String[a][2];
        keuangan = new double[a][4];
    }

    public void setNama(String nama) {
        data[a][0] = nama;
    }

    public void setNIK(String nik) {
        data[a][1] = nik;
    }

    public void setGaji(double gaji) {
        keuangan[a][0] = gaji;
    }

    public void setTunjangan(double tunjangan) {
        keuangan[a][1] = tunjangan;
    }

    public void setBonus(double bonus) {
        keuangan[a][2] = bonus;
    }

    public void setDenda(double denda) {
        keuangan[a][3] = denda;
    }
    
    public void displayMenu(){
        System.out.println("1. Tentukan jumlah Karyawan");
        System.out.println("2. Masukkan");
    }
    
}
