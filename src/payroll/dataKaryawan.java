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
public class dataKaryawan {

    private int nik, gaji, tunjangan, bonus, denda;
    private String nama;

    public dataKaryawan(int a, String b, int c, int d, int e, int f) {
        nik = a;
        nama = b;
        gaji = c;
        tunjangan = d;
        bonus = e;
        denda = f;
    }
}
