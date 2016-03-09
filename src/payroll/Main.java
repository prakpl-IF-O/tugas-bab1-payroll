/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Kenank
 */
import java.util.ArrayList;
public class Main {
    public static void main (String[]args){
        double p ;
        ArrayList <DataPegawai> data=new ArrayList();
        Jam pegawai1=new Jam(101,"2016-01-15",08.00,17.00);
        Jam pegawai2=new Jam(101,"2016-01-15",08.00,18.30);
        Jam pegawai3=new Jam(102,"2016-01-15",08.00,15.00);
        Jam pegawai4=new Jam(103,"2016-01-15",08.00,17.00);
        ArrayList<DataPegawai>dayu=new ArrayList();
        DataPegawai peg1=new DataPegawai(101,"paijo",900,200,150,75);
        DataPegawai peg2=new DataPegawai(102,"lulu",875,200,100,100);
        DataPegawai peg3=new DataPegawai(103,"lala",1000,350,200,125);
        
        Hari a=new Hari();
        Hari b=new Hari();
        Hari c=new Hari();
        Hari d=new Hari();
        
        PerhitunganGaji e=new PerhitunganGaji ();
        PerhitunganGaji f=new PerhitunganGaji ();
        PerhitunganGaji g=new PerhitunganGaji ();
        PerhitunganGaji h=new PerhitunganGaji ();
        
        //e.hitung(a.pow("2016-01-15"),pegawai1.Getmasuk(),pegawai1.Getkeluar(),pegawai1.Getbonus(),pegawai1.Getgaji(),pegawai1.Gettunjangan(),pegawai1.Getdenda());
        e.hitung(a.pow("2016-01-15"), pegawai1.Getmasuk(),pegawai1.Getkeluar(),pegawai1.Getbonus(),pegawai1.Getgaji(),pegawai1.Gettunjangan(),pegawai1.Getdenda());
        f.hitung(a.pow("2016-01-15"), pegawai2.Getmasuk(),pegawai2.Getkeluar(),pegawai2.Getbonus(),pegawai2.Getgaji(),pegawai2.Gettunjangan(),pegawai2.Getdenda());
        g.hitung(a.pow("2016-01-15"), pegawai3.Getmasuk(),pegawai3.Getkeluar(),pegawai3.Getbonus(),pegawai3.Getgaji(),pegawai3.Gettunjangan(),pegawai3.Getdenda());
        h.hitung(a.pow("2016-01-15"), pegawai4.Getmasuk(),pegawai4.Getkeluar(),pegawai4.Getbonus(),pegawai4.Getgaji(),pegawai4.Gettunjangan(),pegawai4.Getdenda());
        double ef= e.Getgajitotal()+f.Getgajitotal();
        
        
        System.out.println("========================HASIL GAJI KARYAWAN========================");
        System.out.println("|NIK\t|Nama\t|gaji\t|tunjangan\t|bonus\t|denda\ttotal gaji");
        pegawai1.Display();
        System.out.printf("%.0f\n",e);
        System.out.println("===================================================================");
        pegawai2.Display();
        System.out.printf("%.0f",f.Getgajitotal());
        System.out.println("===================================================================");
        pegawai3.Display();
        System.out.printf("%.0f\n",g.Getgajitotal());
        System.out.println("===================================================================");
        
        
    }
}
