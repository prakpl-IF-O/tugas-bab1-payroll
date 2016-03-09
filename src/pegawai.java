/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win_8.1
 */
public class pegawai {
 private String NIK;
 private String denda;
 private String gaji;
 private String tunjangan;
 private String nama;
 private String bonus;
 private int jam_masuk [] = new int [9] ;
 private int jam_keluar [] = new int [9];
 private int hari [] = new int [9];
 private int bulan [] = new int [9];
 private int tahun [] = new int [9];
 
public pegawai ( String nomer1, String pelanggaran1, String bayaran1, String bantuan1,String jeneng1, String untung1){
    bonus = untung1;
    String nama = jeneng1;
    String tunjangan = bantuan1;
    String gaji = bayaran1;
    String denda = pelanggaran1;
    String nik = nomer1;
}
    public void datang (int rangkaian , int jam_masuk1, int jam_keluar1, int hari1, int bulan1, int tahun1){
    jam_masuk[rangkaian] = jam_masuk1;
    jam_keluar[rangkaian] = jam_keluar1;
    hari [rangkaian] = hari1;
    bulan [rangkaian] = bulan1;
    tahun [rangkaian] = tahun1;
    } 
    public int pelanggaran_masuk (rangkaian){
        if jam_masuk() 
    }
  
}
