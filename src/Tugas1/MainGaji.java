/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dino Keylas
 */
import java.util.ArrayList;
public class MainGaji {
    public static void main(String[] args) {
         ArrayList<karyawan> data=new ArrayList();
         karyawan kar1=new karyawan(101,"paijo",900,200,150,75);
         karyawan kar2=new karyawan(102,"lulu",875,200,100,100);
         karyawan kar3=new karyawan(102,"lala",1000,350,200,125);
         
         ArrayList<DataKerja> DK=new ArrayList();
         DataKerja aa= new DataKerja(101,"2016-01-15",08.00,17.00);
         DataKerja bb= new DataKerja(101,"2016-01-16",08.00,18.30);
         DataKerja cc= new DataKerja(101,"2016-01-15",08.00,15.00);
         DataKerja dd= new DataKerja(101,"2016-01-15",08.00,17.00);
         
         cekHari a=new cekHari();
         cekHari b=new cekHari();
         cekHari c=new cekHari();
         cekHari d=new cekHari();
         
        HitungGaji a1=new HitungGaji();
        HitungGaji a2=new HitungGaji();
        HitungGaji a3=new HitungGaji();
        HitungGaji a4=new HitungGaji();
        
        a1.hirungGaji(a.CekHari("2016-01-15"), aa.getJamker(), aa.getJampul(),kar1.getBonus() , kar1.getDenda(), kar1.getGaji(), kar1.getTunjangan());
        a2.hirungGaji(a.CekHari("2016-01-16"), bb.getJamker(), bb.getJampul(),kar1.getBonus() , kar1.getDenda(), kar1.getGaji(), kar1.getTunjangan());
        a3.hirungGaji(a.CekHari("2016-01-15"), cc.getJamker(), cc.getJampul(),kar2.getBonus() , kar2.getDenda(), kar2.getGaji(), kar2.getTunjangan());
        a4.hirungGaji(a.CekHari("2016-01-15"), dd.getJamker(), dd.getJampul(),kar3.getBonus() , kar3.getDenda(), kar3.getGaji(), kar3.getTunjangan());
        
    }
}
