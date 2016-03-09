
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//nik,tanggal,jam_masuk,jam_pulang // column header, tidak disimpan
//101,2016-01-15,08:00,17:00
//101,2016-01-16,08:00,18:30
//102,2016-01-15,08:00,15:00
//103,2016-01-15,08:00,17:00

/**
 *
 * @author gunka
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        double masuk = 08.00;
        double pulang = 17.00;
        double[] bonus = new double[4];
        double[] denda = new double[4];
        double[] denda1 = new double[4];
        double[] total_gaji = new double[4];
        Karyawan k[] = new Karyawan[4];
        Absensi a[] = new Absensi[4];
        String hari1 = "Saturday";
        String hari2 = "Sunday";

//        nik,nama,gaji,tunjangan,bonus,denda
        k[0] = new Karyawan(101, "paijo", 900, 200, 150, 75);
        k[1] = new Karyawan(101, "paijo", 900, 200, 150, 75);
        k[2] = new Karyawan(102, "lulu", 875, 200, 100, 100);
        k[3] = new Karyawan(103, "lala", 1000, 350, 200, 125);

        //nik,tanggal,jam_masuk,jam_pulang
        a[0] = new Absensi(101, "2016-01-15", 08.00, 17.00);
        a[1] = new Absensi(101, "2016-01-16", 08.00, 18.30);
        a[2] = new Absensi(102, "2016-01-15", 08.00, 15.00);
        a[3] = new Absensi(103, "2016-01-15", 08.00, 17.00);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("EEEE");

//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        String formatted = dateFormat.format(tanggal);
        for (int i = 0; i < 4; i++) {
            if (masuk < a[i].jam_masuk) {
                denda[i] = 0;
            } else {
                denda[i] = k[i].denda * (a[i].jam_masuk - masuk);
            }

            if (pulang > a[i].jam_pulang) {
                bonus[i] = 0;
                denda1[i] = (pulang - a[i].jam_pulang) * k[i].denda;
            } else {
                bonus[i] = (a[i].jam_pulang - pulang) * k[i].bonus;
                denda1[i] = 0;
            }
            Date tanggal = dateFormat.parse(a[i].tanggal);
            calendar.setTime(tanggal);
            String tanggal1 = dateFormat1.format(calendar.getTime());
            denda[i] += denda1[i];
            System.out.println(a[i].tanggal);
            System.out.println(tanggal1);
            String z = tanggal1;
            if ((z.equals(hari1)) || (z.equals(hari2))) {
                bonus[i] = (a[i].jam_pulang - a[i].jam_masuk) * k[i].bonus;
                System.out.println(bonus[i]);
            }
            System.out.println("z: " + z);
            System.out.println("Bonus: " + bonus[i] + " Denda: " + denda[i]);
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            total_gaji[i] = (k[i].gaji + k[i].tunjangan + bonus[i]) - denda[i];
            System.out.println(total_gaji[i]);
        }
    }
}
