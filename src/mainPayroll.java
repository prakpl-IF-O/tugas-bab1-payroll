
public class mainPayroll {

    public static void main(String[] args) {
        String nama;
        int nik, gaji, tunjangan;

        Payroll karyawan0 = new Payroll();
        Payroll karyawan1 = new Payroll();
        Payroll karyawan2 = new Payroll();
        
        System.out.println("~~~Payroll Karyawan~~~");
        System.out.println("*Info*");
        System.out.println("-Bonus : 50000/jam (Hari Kerja), 100000/jam (Hari Libur)");
        System.out.println("-Denda : 50000/jam");
        
        //Data karyawan
        nama = "Akik";
        karyawan0.setNama(nama);
        nik = 1001;
        karyawan0.setNik(nik);
        gaji = 1000;
        karyawan0.setGaji(gaji);
        tunjangan = 200;
        karyawan0.setTunjangan(tunjangan);
        karyawan0.displayData();
        System.out.println("");
        System.out.println("~~~Absensi Karyawan~~~");
        //Absensi Karyawan
        //format : {jamMasuk, menitMasuk, jamPulang, menitPulang}
        int jam0[][] = {{8, 0, 17, 0}, {8, 30, 17, 30}};
        //format : {tahun, bulan, tanggal}
        int tgl0[][] = {{2016, 3, 9}, {2016, 3, 10}};
        for (int i = 0; i < jam0.length; i++) {
            karyawan0.setJamMasuk(jam0[i][0]);
            karyawan0.setMenitMasuk(jam0[i][1]);
            karyawan0.setJamPulang(jam0[i][2]);
            karyawan0.setMenitPulang(jam0[i][3]);
            karyawan0.setHari(tgl0[i][0], tgl0[i][1], tgl0[i][2]);
            karyawan0.setBonusDenda();
            karyawan0.displayGaji();
        }
        karyawan0.setTotalgaji();
        System.out.println("Total gaji\t: " + karyawan0.getTotalgaji() + "000");

        //Data karyawan
        nama = "Boto";
        karyawan1.setNama(nama);
        nik = 1002;
        karyawan1.setNik(nik);
        gaji = 900;
        karyawan1.setGaji(gaji);
        tunjangan = 200;
        karyawan1.setTunjangan(tunjangan);
        karyawan1.displayData();
        System.out.println("");
        System.out.println("~~~Absensi Karyawan~~~");
        //Absensi Karyawan
        //format : {jamMasuk, menitMasuk, jamPulang, menitPulang}
        int jam1[][] = {{7, 55, 18, 0}, {9, 0, 19, 0}, {8, 10, 16, 0}};
        //format : {tahun, bulan, tanggal}
        int tgl1[][] = {{2016, 3, 10}, {2016, 3, 11}, {2016, 3, 12}};
        for (int i = 0; i < jam0.length; i++) {
            karyawan1.setJamMasuk(jam1[i][0]);
            karyawan1.setMenitMasuk(jam1[i][1]);
            karyawan1.setJamPulang(jam1[i][2]);
            karyawan1.setMenitPulang(jam1[i][3]);
            karyawan1.setHari(tgl1[i][0], tgl1[i][1], tgl1[i][2]);
            karyawan1.setBonusDenda();
            karyawan1.displayGaji();
        }
        karyawan1.setTotalgaji();
        System.out.println("Total gaji\t: " + karyawan1.getTotalgaji() + "000");

        //Data karyawan
        nama = "Cecep";
        karyawan2.setNama(nama);
        nik = 1003;
        karyawan2.setNik(nik);
        gaji = 1200;
        karyawan2.setGaji(gaji);
        tunjangan = 200;
        karyawan2.setTunjangan(tunjangan);
        karyawan2.displayData();
        System.out.println("");
        System.out.println("~~~Absensi Karyawan~~~");
        //Absensi Karyawan
        //format : {jamMasuk, menitMasuk, jamPulang, menitPulang}
        int jam2[][] = {{8, 30, 19, 45}, {10, 0, 11, 30}};
        //format : {tahun, bulan, tanggal}
        int tgl2[][] = {{2016, 3, 13}, {2016, 3, 14}};
        for (int i = 0; i < jam2.length; i++) {
            karyawan2.setJamMasuk(jam2[i][0]);
            karyawan2.setMenitMasuk(jam2[i][1]);
            karyawan2.setJamPulang(jam2[i][2]);
            karyawan2.setMenitPulang(jam2[i][3]);
            karyawan2.setHari(tgl2[i][0], tgl2[i][1], tgl2[i][2]);
            karyawan2.setBonusDenda();
            karyawan2.displayGaji();
        }
        karyawan2.setTotalgaji();
        System.out.println("Total gaji\t: " + karyawan2.getTotalgaji() + "000");
    }
}
