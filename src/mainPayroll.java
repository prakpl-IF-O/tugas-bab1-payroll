
public class mainPayroll {

    public static void main(String[] args) {
        String nama;
        int nik, gaji, tunjangan, jamMasuk, jamPulang, menitMasuk, menitPulang, thn, bln, tgl;

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

        nama = "Boni";
        karyawan1.setNama(nama);
        nik = 102;
        karyawan1.setNik(nik);
        gaji = 1100;
        karyawan1.setGaji(gaji);
        tunjangan = 300;
        karyawan1.setTunjangan(tunjangan);

        nama = "Cecep";
        karyawan2.setNama(nama);
        nik = 103;
        karyawan2.setNik(nik);
        gaji = 1200;
        karyawan2.setGaji(gaji);
        tunjangan = 300;
        karyawan2.setTunjangan(tunjangan);

        //Absensi Karyawan
        tgl = 9;
        bln = 3;
        thn = 2016;
        karyawan0.setHari(thn, bln, tgl);
        jamMasuk = 8;
        karyawan0.setJamMasuk(jamMasuk);
        menitMasuk = 00;
        karyawan0.setMenitMasuk(menitMasuk);
        jamPulang = 16;
        karyawan0.setJamPulang(jamPulang);
        menitPulang = 59;
        karyawan0.setMenitPulang(menitPulang);
        karyawan0.setBonus();
        karyawan0.setTotalgaji();
        karyawan0.display();
        tgl = 12;
        bln = 3;
        thn = 2016;
        karyawan0.setHari(thn, bln, tgl);
        jamMasuk = 8;
        karyawan0.setJamMasuk(jamMasuk);
        menitMasuk = 00;
        karyawan0.setMenitMasuk(menitMasuk);
        jamPulang = 9;
        karyawan0.setJamPulang(jamPulang);
        menitPulang = 00;
        karyawan0.setMenitPulang(menitPulang);
        karyawan0.setBonus();
        karyawan0.setTotalgaji();
        karyawan0.display();

    }
}
