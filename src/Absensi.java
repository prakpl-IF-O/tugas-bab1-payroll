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
public class Absensi {
   int nik;
   String tanggal; 
   double jam_masuk, jam_pulang;
   
   Absensi(int nik, String tanggal, double jam_masuk, double jam_pulang){
       this.nik = nik;
       this.tanggal = tanggal;
       this.jam_masuk = jam_pulang;
       this.jam_pulang = jam_pulang;
   }
}
