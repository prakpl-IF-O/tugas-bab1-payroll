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
        //nik nama gaji bonus denda tunnjangan
    pengolahan_gaji_krywn kry1 = new pengolahan_gaji_krywn (101, "paijo", 900, 150, 75 , 200);
    pengolahan_gaji_krywn kry2 = new pengolahan_gaji_krywn (102, "lulu", 875, 100, 100 , 200);
    pengolahan_gaji_krywn kry3 = new pengolahan_gaji_krywn (103, "lala", 1000, 200, 120 , 350);

    kry1.check_in(0, 8, 2016, 01, 15,  17, 101);
    kry1.check_in(1, 8, 2016, 01, 16,  18, 101);
    kry2.check_in(0, 8, 2016, 01, 15,  15, 102);
    kry3.check_in(0, 8, 2016, 01, 15,  17, 103);
    
        
        System.out.println("NIK \t Nama \t Gaji \t Tunjangan \t Bonus \t Denda \t Total Gaji");
        System.out.println(kry1.hasil_gaji());
        System.out.println(kry2.hasil_gaji());
        System.out.println(kry3.hasil_gaji());
    }
}
