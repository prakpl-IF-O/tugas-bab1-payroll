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

    public int data[][] = new int[3][4];

    public int dataKaryawan() {
        data[0][0] = 900;
        data[0][1] = 200;
        data[0][2] = 150;
        data[0][3] = 75;
        data[1][0] = 875;
        data[1][1] = 200;
        data[1][2] = 100;
        data[1][3] = 100;
        data[2][0] = 1000;
        data[2][1] = 300;
        data[2][2] = 200;
        data[2][3] = 125;
        return data[0][0];
    }

    public void dataDisplay1() {
        dataKaryawan();
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
        System.out.print("101,paijo");
        for (int x = 0; x < data[1].length; x++) {
            System.out.print("," + data[0][x]);
        }
        System.out.println("");
        System.out.print("102,paijo");
        for (int x = 0; x < data[1].length; x++) {
            System.out.print("," + data[1][x]);
        }
        System.out.println("");
        System.out.print("103,lala");
        for (int x = 0; x < data[1].length; x++) {
            System.out.print("," + data[2][x]);
        }
    }

}
