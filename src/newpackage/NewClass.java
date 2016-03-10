/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Andy Wiranto
 */
public class NewClass {

    public static void main(String[] args) {


        karyawan a = new karyawan(101, "Paijo", 900, 200, 150, 75);
        karyawan b = new karyawan(102, "Lulu", 875, 200, 100, 100);
        karyawan c = new karyawan(103, "Lala", 1000, 350, 200, 120);

        System.out.println("");
        a.cetak();
        b.cetak();
        c.cetak();
        System.out.println("-----------------------------");
     

    }

}
