/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

/**
 *
 * @author dwiyan
 */
public class MainKaryawan {

    public static void main(String[] args) {
        String data[][] = new String[4][4];
        Karyawan tampil = new Karyawan();
        JadwalKaryawan tampil1 = new JadwalKaryawan();
        HitungGaji tampil2 = new HitungGaji();
        tampil.dataDisplay1();
        tampil.dataKaryawan();
      
      
        System.out.println("\n");
        tampil1.display();
        System.out.println("\n");
        tampil1.setJadwal();
        //System.out.println(data[0][0]);
     //  System.out.println(data[4][4]);
       //tampil2.hitungDenda(data[], null, ap)
    }
}
