/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

public class karyawan {

    public static int totalgaji, jm, jp, nik, gaji, tunjangan, bonus, denda;
    public static String nama;

    public void setNik(int i) {
        nik = i;
    }

    public void setJm(int i) {
        jm = i;
    }

    public void setJp(int i) {
        jp = i;
    }

    public void setGaji(int i) {
        gaji = i;
        Totalgaji();
    }

    public void setTunjangan(int i) {
        tunjangan = i;
        Totalgaji();
    }

    public void setBonus(int i) {
        bonus = i;
        Totalgaji();
    }

    public void setDenda(int i) {
        denda = i;
        Totalgaji();
    }

    public void setNama(String s) {
        nama = s;
    }
    private void Totalgaji(){
        totalgaji=(gaji+tunjangan+bonus)-denda;
    }

    public void displayMessage() {
        System.out.println("Nama : "+nama);
        System.out.println("NIK : "+nik);
        System.out.println("Gaji : "+gaji);
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Bonus : "+bonus);
        System.out.println("Denda : "+ denda);
        System.out.println("Total gaji : "+totalgaji);
        System.out.println("========================");
    }

}
