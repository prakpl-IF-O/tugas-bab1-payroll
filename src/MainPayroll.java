package mainpayroll;
public class MainPayroll {
    public static void main(String[] args) {
     Karyawan k1 = new Karyawan(101,"Paijo",900,200,150,75);
     Absensi a1 = new Absensi(101,"2016-01-15","08:00","17:00");
     Absensi a1_ = new Absensi(101,"2016-01-16","08:00","18:30");
     Karyawan k2 = new Karyawan (102,"Lulu",875,200,100,100);
     Absensi a2 = new Absensi (102,"2016-01-15","08:00","15:00");
     Karyawan k3 = new Karyawan (103,"Lala",1000,350,200,125);
     Absensi a3 = new Absensi(103,"2016-01-15","08:00","17:00");
     
     System.out.println("            DATA KARYAWAN             ");
     System.out.println("======================================");
     System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
     k1.dataKaryawan();
     k2.dataKaryawan();
     k3.dataKaryawan();
     System.out.println(" ");
     System.out.println("            DATA ABSENSI              ");
     System.out.println("======================================");
     System.out.println("nik,tanggal,jam_masuk,jam_pulang");
     a1.dataAbsensi();
     a1_.dataAbsensi();
     a2.dataAbsensi();
     a3.dataAbsensi();
     System.out.println(" ");
     System.out.println("          DATA HASIL PENGOLAHAN TOTAL GAJI          ");
     System.out.println("====================================================");
     System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
     k1.tampilan();
     k2.tampilan();
     k3.tampilan();
    }
}
