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
 private int NIK;
 private int denda;
 private int gaji;
 private int tunjangan;
 private int nama;
 private int bonus;
 private int jam_masuk [] = new int [9] ;
 private int jam_keluar [] = new int [9];
 private int hari [] = new int [9];
 private int bulan [] = new int [9];
 private int tahun [] = new int [9];
 private int nomer_kehadiran [] = new int [9];
 int ketepatan =0;
 int denda_semuanya = 0;
 int denda_ketepatan = 0;
 int bonus_semua = 0;
 int total_bayaran = 0;
    boolean total_gaji;
public pegawai ( String nomer1, String pelanggaran1, String bayaran1, String bantuan1,String jeneng1, String untung1){
    String bonus = untung1;
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
    public int pelanggaran_masuk (int rangkaian){
        if (jam_masuk[rangkaian]<=8) {
            return 0 ;
        } 
        else {
            return ((jam_masuk[rangkaian] - 8) * denda );
        }
    }
   public int pelanggaran_keluar (int rangkaian) {
       if (jam_keluar[rangkaian]< 17) {
           return ((17 - jam_keluar[rangkaian]) *denda);
       }
       else
           return 0;
       }
       public int denda (){
           for (int a=0; a<ketepatan; a++) {
           denda_semuanya += pelanggaran_masuk(a);
           denda_semuanya += pelanggaran_keluar(a);
           } return denda_semuanya;
   }
        public int hadir (){
            for (int b =0; b<9; b++)
                if (nomer_kehadiran [b]==0){
                }
                else{
                    ketepatan++;
                }
            return 0;
        }
        public String total(){
            total_bayaran = gaji + (bonus+ tunjangan - denda) ;
     return null;
        }
        
}