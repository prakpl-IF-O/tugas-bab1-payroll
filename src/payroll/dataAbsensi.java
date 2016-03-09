/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Faza Abdi
 */
public class dataAbsensi {

    private int nik;
    private double jam_masuk, jam_pulang;
    private String tanggal;

    public dataAbsensi(int a, String b, double c, double d) {
        nik = a;
        tanggal = b;
        jam_masuk = c;
        jam_pulang = d;
    }

    public int getNik() {
        return nik;
    }

    public double getJam_masuk() {
        return jam_masuk;
    }

    public double getJam_pulang() {
        return jam_pulang;
    }

    public String getTanggal() {
        return tanggal;
    }
}
