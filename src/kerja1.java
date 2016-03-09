/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class kerja1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kerja k1= new Kerja ();
        k1.setKaryawan("Rizki","1551", 2000,200);
        k1.setAbsensi(15,01,2016, 8.00,17.00);
        k1.getBonus();
        k1.getDenda();
        k1.getTotal();
        k1.display();
        System.out.println("========================");
        Kerja k2 = new Kerja ();
        k2.setKaryawan("Surya","1561", 1750,200);
        k2.setAbsensi(16,01,2016, 8.00,18.00);
        k2.getBonus();
        k2.getDenda();
        k2.getTotal();
        k2.display();
        System.out.println("========================");
        Kerja k3 = new Kerja ();
        k3.setKaryawan("Zaki","1571", 1500,200);
        k3.setAbsensi(14,01,2016, 7.00,15.00);
        k3.getBonus();
        k3.getDenda();
        k3.getTotal();
        k3.display();
        // TODO code application logic here
    }
    
}
