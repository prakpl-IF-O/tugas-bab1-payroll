/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

import java.util.Scanner;

/**
 *
 * @author dwiyan
 */
public class MainKaryawan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = 0;
        String s;
        
        Karyawan absensi = new Karyawan();

        System.out.print("Masukkan jumlah karyawan : ");
        jumlah = in.nextInt();
        String data [][]= new String[jumlah][2];

        System.out.print("Masukkan nama : ");
        s = in.next();
absensi.setNama(s, 0);

        System.out.print("Masukkan nik : ");
        s = in.next();
        absensi.setNIK(s,0);
        
        System.out.println("");
    }
}
