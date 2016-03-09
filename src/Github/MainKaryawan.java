/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

import java.text.ParseException;

/**
 *
 * @author dwiyan
 */
public class MainKaryawan {

    public static void main(String[] args) throws ParseException {
        GajiKaryawan tampil3 = new GajiKaryawan();
        Karyawan tampil = new Karyawan();
        JadwalKaryawan tampil1 = new JadwalKaryawan();
        HitungGaji tampil2 = new HitungGaji();
        tampil.dataDisplay1();
        tampil.dataKaryawan();
        System.out.println("\n");
        tampil1.display();
        System.out.println("");
        tampil3.tampilGaji();
        System.out.println("\n");
    }
}
