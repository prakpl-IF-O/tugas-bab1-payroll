/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enggar Pratama
 */
public class pengolahan_gaji_krywn {    
    private int NIK;    
    private String nama;    
    private int gaji;    
    private int bonus;    
    private int denda;    
    private int hasil_gaji;
    private int tunjangan;
    private int jam_mas[] = new int [5000];
    private int year[] = new int [5000];
    private int month [] = new int [5000];
    private int day [] = new int [5000];
    private int jam_kel [] = new int [5000];
    private int NIK_absensi[] = new int [5000];
    private int kedatangan=0;
    private int bonus_keseluruhan=0;
    public pengolahan_gaji_krywn(int NIK1, String nama1, int gaji1, int bonus1 , int denda1, int tunjangan1){
       NIK = NIK1;
       nama = nama1;
       gaji = gaji1;
       bonus = bonus1;
       denda = denda1;
       tunjangan = tunjangan1;
    }
    public void check_in (int urutan, int jam_mas1, int year1, int month1, int day1, int jam_kel1, int NIK_absensi1){
       jam_mas[urutan] = jam_mas1;
       year[urutan] = year1;
       month[urutan] = month1;
       day[urutan] = day1;
       jam_kel[urutan] = jam_kel1;
       NIK_absensi[urutan] = NIK_absensi1;
    }
    public void persensi (){
        for ( int x = 0; x < 5000; x++ )
        if (NIK_absensi[x] != 0 ){
            kedatangan++;
        }
    }
    public int bonus (){
        for ( int x = 0;x< kedatangan; x++ ){
            if (day[x] == 16){
                bonus_keseluruhan = bonus_keseluruhan + ((jam_kel[x] - jam_mas[x]) * bonus );
            }
            else {
                if (jam_kel[x] > 17)
                    bonus_keseluruhan = bonus_keseluruhan + ((jam_kel[x] - 17 )* bonus );
            }
        }
        return bonus_keseluruhan;
    }
}