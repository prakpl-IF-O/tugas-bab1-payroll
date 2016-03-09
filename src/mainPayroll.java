
public class mainPayroll {

    public static void main(String[] args) {
        String nama;
        int nik, gaji, tunjangan;

        Payroll karyawan0 = new Payroll();
        Payroll karyawan1 = new Payroll();
        Payroll karyawan2 = new Payroll();

        //Data karyawan
        nama = "Aki";
        karyawan0.setNama(nama);
        nik = 101;
        karyawan0.setNik(nik);
        gaji = 1000;
        karyawan0.setGaji(gaji);
        tunjangan = 300;
        karyawan0.setTunjangan(tunjangan);
        karyawan0.displayData();
        System.out.println("");
        System.out.println("~~~Absensi Karyawan~~~");
        //Absensi Karyawan
        //format : {jamMasuk, menitMasuk, jamPulang, menitPulang}
        int jam[][] = {{8, 0, 17, 0}, {9, 0, 16, 0}, {9, 0, 16, 0}};
        //format : {tahun, bulan, tanggal}
        int tgl[][] = {{2016, 3, 9}, {2016, 3, 12}, {2016, 3, 31}};
        for (int i = 0; i < jam.length; i++) {
            karyawan0.setJamMasuk(jam[i][0]);
            karyawan0.setMenitMasuk(jam[i][1]);
            karyawan0.setJamPulang(jam[i][2]);
            karyawan0.setMenitPulang(jam[i][3]);
            karyawan0.setHari(tgl[i][0], tgl[i][1], tgl[i][2]);
            karyawan0.setBonusDenda();
            karyawan0.displayGaji();
        }
        karyawan0.setTotalgaji();
        System.out.println("Total gaji\t: " + karyawan0.getTotalgaji());
    }
}
