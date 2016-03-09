/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

import java.time.LocalTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

/**
 *
 * @author dwiyan
 */
public class HitungGaji {

    JadwalKaryawan m2 = new JadwalKaryawan();

    public double hitungDenda(String hari, String awal, String akhir, int ap) throws ParseException {
        double denda = 0;
        JadwalKaryawan k1 = new JadwalKaryawan();
        Date waktu = new Date(116, 0, 16);
        Date waktul = new Date(116, 0, 17);
        SimpleDateFormat paijo1 = new SimpleDateFormat("EEEE");
        k1.setJadwal();
        String tgl = hari;
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date tgl1 = df.parse(tgl);
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        String tgl2 = df2.format(tgl1);

        String hari1 = paijo1.format(waktu);
        String hari2 = paijo1.format(waktu);
        String hari3 = paijo1.format(waktu);

        Boolean cek = hari1.equals(hari3);
        Boolean cek2 = hari2.equals(hari3);

        if (cek2 == false || cek == false) {

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
        } else {
            return 0;
        }
        return denda;
    }

    public double hitungBonus(String hari, String awal, String akhir, int ap) throws ParseException {
        double bonus = 0;
        JadwalKaryawan k1 = new JadwalKaryawan();
        Date waktu = new Date(116, 0, 16);
        Date waktul = new Date(116, 0, 17);
        SimpleDateFormat paijo1 = new SimpleDateFormat("EEEE");
        k1.setJadwal();
        String tgl = hari;
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date tgl1 = df.parse(tgl);
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        String tgl2 = df2.format(tgl1);

        String hari1 = paijo1.format(waktu);
        String hari2 = paijo1.format(waktu);
        String hari3 = paijo1.format(waktu);

        Boolean cek = hari1.equals(hari3);
        Boolean cek2 = hari2.equals(hari3);

        if (cek2 == true || cek == true) {

            String ao = awal;
            String ba = akhir;

            LocalTime b = LocalTime.parse(ao);
            LocalTime c = LocalTime.parse(ba);
        } else {

        }
        return bonus;
    }

    public double bonusWeekend(String a) {

        return 0;
    }
}
