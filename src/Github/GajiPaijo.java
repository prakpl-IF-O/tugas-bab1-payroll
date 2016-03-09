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
public class GajiPaijo {

    /* HitungGaji m2 = new HitungGaji();
     //    JadwalKaryawan m1 = new JadwalKaryawan();

     public double joDenda() throws ParseException {

     return m2.hitungDenda("2016-01-15","08:00", "17:00", 75);

     }
     */
    public static void main(String[] args) throws ParseException {
        HitungGaji m2 = new HitungGaji();
        double a = m2.hitungDenda("2016-01-11", "10:00", "17:00", 75);
        System.out.println(a);

        double b = m2.hitungBonus("2016-01-15", "08:00", "18:00", 150);
        System.out.println(b);

        double c = m2.hitungBonus("2016-01-15", "08:00", "18:00", 150);
        System.out.println(c);
        
        
    }
}
