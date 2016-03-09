/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

import java.time.LocalTime;
import java.text.SimpleDateFormat;

/**
 *
 * @author dwiyan
 */
public class HitungGaji {

    public void hitung() {
        double gaji = 0;
        JadwalKaryawan k1 = new JadwalKaryawan();

        k1.setJadwal();
        String a = "00:00";
        String b = "01:00";
        LocalTime a1 = LocalTime.parse(a);
        LocalTime b1 = LocalTime.parse(b);

        
    }

    public double bonus(double b) {
        double banyakBonus = 0;
        return banyakBonus;
    }
}
