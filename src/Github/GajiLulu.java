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
public class GajiLulu {

    public double dendaLulu() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double denda = m2.hitungDenda("2016-01-15", "08:00", "15:00", 100);
        return denda;

    }

    public double bonusLulu() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double bonus = m2.hitungBonus("2016-01-15", "08:00", "15:00", 100);
        return bonus;
    }

    public double totalLulu() throws ParseException {
        double a = bonusLulu();
        double b = dendaLulu();

        double totalGaji = 875 + 200 + a - b;

        return totalGaji;
    }
}
