/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win_8.1
 */
public class MAIN {
    public static void main(String[] args) {
        pegawai pegawai1 = new pegawai ("101", "75", "900", "200", "paijo", "150");
        pegawai pegawai2 = new pegawai ("102", "100", "875", "200", "lulu", "100");
        pegawai pegawai3 = new pegawai ("103", "125", "1000", "350", "lala", "200");
        
        pegawai1.datang(0, 8, 17, 1, 15, 2016 );
        pegawai1.datang(1, 8, 18, 1, 16, 2016 );
        pegawai2.datang(0, 8, 15, 1, 15, 2016 );
        pegawai3.datang(0, 8, 17, 1, 15, 2016 );
    
        System.out.println("NIK \t nama \t gaji \t tunjangan\t bonus\t dnda\t total_bayaran ");
        System.out.println(pegawai1.total_gaji);
        System.out.println(pegawai2.total_gaji);
        System.out.println(pegawai3.total_gaji);
    
    }
 
}
   
