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
public class DataKerja {

    private int nik;
    private String tanggal;
    private double jamker, jampul;

    public DataKerja(int nik, String tanggal, double jamker, double jampul) {
        this.nik = nik;
        this.tanggal = tanggal;
        this.jamker = jamker;
        this.jampul = jampul;
    }

    public int getNik() {
        return nik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public double getJamker() {
        return jamker;
    }

    public double getJampul() {
        return jampul;
    }
}
