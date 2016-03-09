/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
public class database {
    private int nik;
    private String tanggal;
    private double jam_in;
    private double jam_out;

    public database(int nik, String tanggal, double jam_in, double jam_out) {
        this.nik = nik;
        this.tanggal = tanggal;
        this.jam_in = jam_in;
        this.jam_out = jam_out;
    }

    public int getNik() {
        return nik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public double getJam_in() {
        return jam_in;
    }

    public double getJam_out() {
        return jam_out;
    }
    
    
}

