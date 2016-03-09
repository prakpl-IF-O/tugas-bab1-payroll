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
        String tgl = hari;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date tgl1 = df.parse(tgl);
        DateFormat df2 = new SimpleDateFormat("EEEE");
        String tgl2 = df2.format(tgl1);
        String hari1 = paijo1.format(waktu);
        String hari2 = paijo1.format(waktul);
        Boolean cek = hari1.equals(tgl2);
        Boolean cek2 = hari2.equals(tgl2);
        if (cek2 == false || cek == false) {
            String a = "08:00";
            String b = "17:00";
            LocalTime a2 = LocalTime.parse(awal);
            LocalTime b2 = LocalTime.parse(akhir);
            LocalTime a1 = LocalTime.parse(a);
            LocalTime b1 = LocalTime.parse(b);
            Boolean c = a2.isAfter(a1);
            Boolean d = b2.isBefore(b1);
            if (c == true || d == true) {
                int waktu1 = a2.getHour() - a1.getHour();
                int waktu2 = b1.getHour() - b2.getHour();
                denda = (waktu1 + waktu2) * ap;
                return denda;
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
        //System.out.println(waktu);
        String tgl = hari;
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date tgl1 = df.parse(tgl);
        DateFormat df2 = new SimpleDateFormat("EEEE");
        String tgl2 = df2.format(tgl1);
        //System.out.println(tgl2);
        String hari1 = paijo1.format(waktu);
        String hari2 = paijo1.format(waktul);

        //System.out.println(hari1 + " " + hari2);
        Boolean cek = hari1.equals(tgl2);
        Boolean cek2 = hari2.equals(tgl2);
        String satu = awal;
        String dua = akhir;
        String rule = "17:00";
        LocalTime f = LocalTime.parse(rule);
        LocalTime b = LocalTime.parse(satu);
        LocalTime c = LocalTime.parse(dua);
        if (cek2 == true || cek == true) {

            int d = c.getHour() - b.getHour();
            return ap * d;

        } else {

            int e = c.getHour() - f.getHour();
            if (e <= 0) {
             return 0;
            }
            return e * ap;
        }

    }
}
