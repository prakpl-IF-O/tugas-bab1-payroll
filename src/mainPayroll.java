package Tugas_1;

public class mainPayroll {

    public static void main(String[] args) {
        Tanggal t = new Tanggal();
        Karyawan k = new Karyawan();
        Karyawan k1 = new Karyawan();
        Karyawan k2 = new Karyawan();
        Karyawan k3 = new Karyawan();
        Karyawan k4 = new Karyawan();

        k1.dataKaryawan(101, "Paijo", 900, 200, 150, 75);
        k2.dataKaryawan(101, "Paijo", 900, 200, 150, 75);
        k1.dataAbsensi(2016, 1, 15, 8, 17, t.cekSabtuMinggu(15, 1, 2016));
        k2.dataAbsensi(2016, 1, 16, 8, 18, t.cekSabtuMinggu(16, 1, 2016));
        k1.tampilData();
        System.out.println("Total Gaji      : "+(k1.totalGaji()+(k2.hitungBonus()*10)));
        System.out.println("-------------------------------------------");
        
        k3.dataKaryawan(102, "Lulu", 875, 200, 100, 100);
        k3.dataAbsensi(2016, 1, 15, 8, 15, t.cekSabtuMinggu(15, 1, 2016));
        k3.tampilData();
        System.out.println("Total Gaji      : "+k3.totalGaji());
        System.out.println("-------------------------------------------");
        
        k4.dataKaryawan(103, "Lala", 1000, 350, 200, 125);
        k4.dataAbsensi(2016, 1, 15, 8, 17, t.cekSabtuMinggu(15, 1, 2016));
        k4.tampilData();
        System.out.println("Total Gaji      : "+k4.totalGaji());
        System.out.println("-------------------------------------------");
    }
}
