/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.ArrayList;

/**
 *
 * @author Faza Abdi
 */
public class mainPayroll {

    public static void main(String[] args) throws Exception {
        ArrayList<dataKaryawan> dk = new ArrayList();
        dataKaryawan dk1 = new dataKaryawan(101, "paijo", 900, 200, 150, 75);
        dataKaryawan dk2 = new dataKaryawan(102, "lulu", 875, 200, 100, 100);
        dataKaryawan dk3 = new dataKaryawan(103, "lala", 1000, 350, 200, 125);

        ArrayList<dataAbsensi> da = new ArrayList();
        dataAbsensi da1 = new dataAbsensi(101,"2016-01-15",08.00,17.00);
        dataAbsensi da2 = new dataAbsensi(101,"2016-01-16",08.00,18.30);
        dataAbsensi da3 = new dataAbsensi(102,"2016-01-15",08.00,15.00);
        dataAbsensi da4 = new dataAbsensi(103,"2016-01-15",08.00,17.00);
        
    }
}
