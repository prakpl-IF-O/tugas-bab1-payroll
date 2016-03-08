/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfandi
 */

public class Main {
    public static void main(String[] args) {
        data_kalender kalender = new data_kalender();
        data_karyawan karyawan1 = new data_karyawan(101,"Paijo", 900, 200, 150, 75);
        data_karyawan karyawan2 = new data_karyawan(102,"Lulu", 875, 200, 100, 100);
        data_karyawan karyawan3 = new data_karyawan(103,"Lala", 1000, 350, 200, 120);
        
        karyawan1.Absensi(101, 2016, 1, 15, 8, "00", 17, "00", kalender.cek_libur(15, 1, 2016));
        karyawan1.Absensi(101, 2016, 1, 16, 8, "00", 18, "30", kalender.cek_libur(16, 1, 2016));
        karyawan1.rekap_absen();
        
        karyawan2.Absensi(102, 2016, 1, 15, 8, "00", 15, "00", kalender.cek_libur(15, 1, 2016));
        karyawan2.rekap_absen();
        
        karyawan3.Absensi(103, 2016, 1, 15, 8, "00", 17, "00", kalender.cek_libur(15, 1, 2016));
        karyawan3.rekap_absen();
        
        System.out.println("NIK\tNama\tGaji\tTunjangan\tBonus\tDenda\tTotal Gaji");
        karyawan1.tampilkan_tabel();
        karyawan2.tampilkan_tabel();
        karyawan3.tampilkan_tabel();
        
    }
}
