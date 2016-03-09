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
public class GajiLala {
    public static void main(String[] args) throws ParseException {
        
        HitungGaji m2 = new HitungGaji();
        double denda = m2.hitungDenda("2016-01-15", "08:00", "17:00", 75);
        System.out.println(denda);

        double bonus2 = m2.hitungBonus("2016-01-15", "08:00", "17:00", 150);
        System.out.println(bonus2);

        double bonus1 = m2.hitungBonus("2016-01-16", "08:00", "18:30", 150);

        System.out.println(bonus1);
        double gajiPaijo = 900 + 200 + bonus1 + bonus2 - denda;
        System.out.println(gajiPaijo);
    }
    public void lalaGaji(){
        
     
       
    }
}
