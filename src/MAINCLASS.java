/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enggar Pratama
 */
public class MAINCLASS {
    public static void main(String[] args) {
    pengolahan_gaji_krywn kry1 = new pengolahan_gaji_krywn (101, "paijo", 900, 150, 125 , 200);
    pengolahan_gaji_krywn kry2 = new pengolahan_gaji_krywn (101, "paijo", 900, 150, 125 , 200);
    pengolahan_gaji_krywn kry3 = new pengolahan_gaji_krywn (101, "paijo", 900, 150, 125 , 200);

    kry1.check_in(0, 8, 2016, 01, 15,  17, 101);
    kry1.check_in(1, 8, 2016, 01, 16,  18, 101);
    kry2.check_in(2, 8, 2016, 01, 15,  15, 102);
    kry3.check_in(3, 8, 2016, 01, 15,  17, 103);
    }
}
