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
    
    public static void main(String[] args) {
        Karyawan k[] = new Karyawan[3];
        Absensi a[] = new Absensi[4];
        
        k[0] = new Karyawan(101,"paijo",900,200,150,75);
        k[1] = new Karyawan(102,"lulu",875,200,100,100);
        k[2] = new Karyawan(103,"lala",1000,350,200,125);
        
        a[0] = new Absensi(101,"2016-01-15",08.00,17.00);
        a[1] = new Absensi(101,"2016-01-16",08.00,18.30);
        a[2] = new Absensi(102,"2016-01-15",08.00,15.00);
        a[3] = new Absensi(102,"2016-01-15",08.00,17.00);
        
        
    }
    
}
