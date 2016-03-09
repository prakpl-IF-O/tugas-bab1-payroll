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

    public static void main(String[] args) {
        double denda;

    }

    public void hitung() {

    }

    public double hitungDenda(String awal, String akhir, int ap) {
        double denda = 0;
        JadwalKaryawan k1 = new JadwalKaryawan();

        k1.setJadwal();
        String a = "08:00";
        String b = "17:00";
        LocalTime a2 = LocalTime.parse(awal);
        LocalTime b2 = LocalTime.parse(akhir);
        LocalTime a1 = LocalTime.parse(a);
        LocalTime b1 = LocalTime.parse(b);

        Boolean c = a1.isAfter(a2);
        Boolean d = b1.isBefore(b2);
        if (c == true || d == true) {

            int waktu1 = a2.getHour() - a1.getHour();
            int waktu2 = b1.getHour() - b2.getHour();

            denda = (waktu1 + waktu2) * ap;
        }
        return denda;
    }
    
    public double hitungBonus(){
        
        return 0;
    }
}
