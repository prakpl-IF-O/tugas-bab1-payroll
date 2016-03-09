/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Aditya
 */

public class MainKaryawan {
    public static void main(String[] args) {
        
    DataPegawai K1 = new DataPegawai();      
        K1.setNik(101);
        K1.setNama("Paijo");
        K1.setGaji(900);
        K1.setTunjangan(200);
        K1.setBonus(150);
        K1.setDenda(75);
        K1.jumDenda1(K1.getDenda());
        K1.jumDenda2(K1.getDenda());
        K1.jumlahdenda();
        K1.tanggal[0]= "2016-01-15";
        K1.masukjam[0]= 8;
        K1.keluarjam[0]= 17;
        K1.tanggal[1]= "2016-01-16";
        K1.masukjam[1]= 8;
        K1.keluarjam[1]= 18.5;
        K1.ketentuanJammasuk1(K1.masukjam[0],K1.keluarjam[0],K1.bonus);
        K1.ketentuanJammasuk2(K1.masukjam[1],K1.keluarjam[1],K1.bonus);
        K1.jumlah();
        K1.TampilkanData();
                
        DataPegawai K2 = new DataPegawai();
        K2.setNik(102);
        K2.setNama("Lulu");
        K2.setGaji(875);
        K2.setTunjangan(200);
        K2.setBonus(100);
        K2.setDenda(100);
       
        
        DataPegawai K3 = new DataPegawai();
        K3.setNik(103);
        K3.setNama("Lala");
        K3.setGaji(1000);
        K3.setTunjangan(350);
        K3.setBonus(200);
        K3.setDenda(125);
       
    }
}
   

