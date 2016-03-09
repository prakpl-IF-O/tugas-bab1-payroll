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
        K1.masukjamkerja[0]= 8;
        K1.keluarjamkerja[0]= 17;
        K1.tanggal[1]= "2016-01-16";
        K1.masukjamkerja[1]= 8;
        K1.keluarjamkerja[1]= 18.5;
        K1.ketentuanJammasuk1(K1.masukjamkerja[0],K1.keluarjamkerja[0],K1.bonus);
        K1.ketentuanJammasuk2(K1.masukjamkerja[1],K1.keluarjamkerja[1],K1.bonus);
        K1.jumlah();
        K1.TampilkanData();
                
        DataPegawai K2 = new DataPegawai();
        K2.setNik(102);
        K2.setNama("Lulu");
        K2.setGaji(875);
        K2.setTunjangan(200);
        K2.setBonus(100);
        K2.setDenda(100);
        K2.tanggal[0]= "2016-01-15";
        K2.masukjamkerja[0]= 8;
        K2.keluarjamkerja[0]= 15;
        K2.tanggal[1]= null;
        K2.ketentuanJammasuk1(K2.masukjamkerja[0],K2.keluarjamkerja[0],K2.bonus);
        K2.jumDenda1(K2.getDenda());
        K2.jumDenda2(K2.getDenda());
        K2.jumlahdenda();
        K2.jumlah();
        K2.TampilkanData();
       
        
        DataPegawai K3 = new DataPegawai();
        K3.setNik(103);
        K3.setNama("Lala");
        K3.setGaji(1000);
        K3.setTunjangan(350);
        K3.setBonus(200);
        K3.setDenda(125);
        K3.tanggal[0]= "2016-01-15";
        K3.masukjamkerja[0]= 8;
        K3.keluarjamkerja[0]=17;
        K3.tanggal[1]= null;
        K3.ketentuanJammasuk1(K3.masukjamkerja[0],K3.keluarjamkerja[0],K3.bonus);
        K3.jumDenda1(K3.getDenda());
        K3.jumDenda2(K3.getDenda());
        K3.jumlahdenda();
        K3.jumlah();
        K3.TampilkanData();      
    }
}