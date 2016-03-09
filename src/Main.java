import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        for (int i = 0; i < 4; i++) {

            if (masuk < Math.floor(a[i].jam_masuk)) {
                denda[i] = 0;
            } else {
                denda[i] = k[i].denda * (Math.floor(a[i].jam_masuk) - masuk);
            }

            if (pulang > Math.floor(a[i].jam_pulang)) {
                bonus[i] = 0;
                denda1[i] = (pulang - Math.floor(a[i].jam_pulang)) * k[i].denda;
            } else {
                bonus[i] = (Math.floor(a[i].jam_pulang) - pulang) * k[i].bonus;
                denda1[i] = 0;
            }

            Date tanggal = dateFormat.parse(a[i].tanggal);
            calendar.setTime(tanggal);
            String tanggal1 = dateFormat1.format(calendar.getTime());
            denda[i] += denda1[i];

            if ((tanggal1.equals("Saturday")) || (tanggal1.equals("Sunday"))) {
                bonus[i] = (Math.floor(a[i].jam_pulang)
                        - Math.floor(a[i].jam_masuk)) * k[i].bonus;
            }
        }
        
        System.out.println("DATA KARYAWAN");
        System.out.println("NIK       NAMA      GAJI      TUNJANGAN BONUS     "
                + "DENDA");
        for (int i = 1;i<4;i++){
            System.out.printf("%-10s", k[i].nik);
            System.out.printf("%-10s", k[i].nama);
            System.out.printf("%-10s", k[i].gaji);
            System.out.printf("%-10s", k[i].tunjangan);
            System.out.printf("%-10s", k[i].bonus);
            System.out.printf("%-10s", k[i].denda);
            System.out.println("");
        }

        System.out.println("");
        System.out.println("DATA ABSENSI");
        System.out.println("NIK         TANGGAL     JAM MASUK   JAM PULANG");       
        for (int i = 0;i<4;i++){
            System.out.printf("%-12s", a[i].nik);
            System.out.printf("%-12s", a[i].tanggal);
            System.out.printf("%-12s","0"+a[i].jam_masuk+"0");
            System.out.printf("%-12s",+a[i].jam_pulang+"0");
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("DATA HASIL PENGOLAHAN TOTAL GAJI");
        System.out.println("NIK       NAMA      GAJI      TUNJANGAN BONUS     "
                + "DENDA     TOTAL GAJI");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (k[i].nik == a[i].nik) {
                    total_gaji[i] = (k[i].gaji + k[i].tunjangan + (bonus[i]
                            + bonus[j])) - (denda[i] + denda[j]);
                } else {
                    total_gaji[i] = (k[i].gaji + k[i].tunjangan + bonus[i]) 
                            - denda[i];
                }
            }
            System.out.printf("%-10s", k[i].nik);
            System.out.printf("%-10s", k[i].nama);
            System.out.printf("%-10s", k[i].gaji);
            System.out.printf("%-10s", k[i].tunjangan);
            System.out.printf("%-10s", k[i].bonus);
            System.out.printf("%-10s", k[i].denda);
            System.out.printf("%-10s", total_gaji[i]);
            System.out.println("");
        }
    }
}
