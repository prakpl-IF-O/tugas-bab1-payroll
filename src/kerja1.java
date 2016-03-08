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
        k1.setKaryawan();
        k1.setAbsensi();
        k1.getBonus();
        k1.getDenda();
        k1.getTotal();
        k1.display();
        System.out.println("========================");
        Kerja k2 = new Kerja ();
        k2.setKaryawan();
        k2.setAbsensi();
        k2.getBonus();
        k2.getDenda();
        k2.getTotal();
        k2.display();
        System.out.println("========================");
        Kerja k3 = new Kerja ();
        k3.setKaryawan();
        k3.setAbsensi();
        k3.getBonus();
        k3.getDenda();
        k3.getTotal();
        k3.display();
        // TODO code application logic here
    }
    
}
