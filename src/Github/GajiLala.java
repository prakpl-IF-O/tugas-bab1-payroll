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

    public double dendaLala() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double denda = m2.hitungDenda("2016-01-15", "08:00", "17:00", 125);
        return denda;

    }

    public double bonusLala() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double bonus = m2.hitungBonus("2016-01-15", "08:00", "17:00", 200);
        return bonus;
    }

    public double totalLala() throws ParseException {
        double a = bonusLala();
        double b = dendaLala();

        double totalGaji = 1000 + 350 + a - b;

        return totalGaji;
    }

    
}
