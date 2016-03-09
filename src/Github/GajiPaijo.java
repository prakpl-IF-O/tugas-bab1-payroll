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
    public double dendaPaijo() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double denda = m2.hitungDenda("2016-01-15", "08:00", "17:00", 75);
        return denda;

    }

    public double bonusPaijo() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double bonus = m2.hitungDenda("2016-01-15", "08:00", "17:00", 150);
        return bonus;
    }

    public double dendaPaijo2() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double denda = m2.hitungDenda("2016-01-16", "08:00", "18:30", 75);
        return denda;

    }

    public double bonusPaijo2() throws ParseException {
        HitungGaji m2 = new HitungGaji();

        double bonus = m2.hitungDenda("2016-01-15", "08:00", "18:30", 150);
        return bonus;
    }

    public double totalPaijo() throws ParseException {
        double a = bonusPaijo2();
        double b = bonusPaijo();
        double c = dendaPaijo();
        double d = dendaPaijo2();
        double totalGaji = 900 + 200 + (a + b) - (c + d);

        return totalGaji;
    }

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
}
