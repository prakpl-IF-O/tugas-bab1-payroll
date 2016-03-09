/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;

import java.text.ParseException;

/**
 *
 * @author dwiyan
 */
public class GajiKaryawan {

    public void tampilGaji() throws ParseException {
        GajiPaijo o1 = new GajiPaijo();
        GajiLulu o2 = new GajiLulu();
        GajiLala o3 = new GajiLala();
        double c = o1.totalPaijo();
        double b = o2.totalLulu();
        double a = o3.totalLala();
        int d = (int) c;
        int e = (int) b;
        int f = (int) a;

        Karyawan o4 = new Karyawan();
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
        String yarra[] = {"101,paijo,900,200,150,75,"};
        for (int x = 0; x < yarra.length; x++) {
            System.out.print(yarra[x]);
        }
        System.out.println(d);
        String yarra1[] = {"102,lulu,875,200,100,100,"};
        for (int x = 0; x < yarra1.length; x++) {
            System.out.print(yarra1[x]);
        }
        System.out.println(e);
        String yarra2[] = {"103,lala,1000,350,200,125,"};
        for (int x = 0; x < yarra2.length; x++) {
            System.out.print(yarra2[x]);
        }
        System.out.println(f);
    }
}
