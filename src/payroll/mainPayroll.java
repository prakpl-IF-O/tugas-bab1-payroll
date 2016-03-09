/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.ArrayList;

/**
 *
 * @author Faza Abdi
 */
public class mainPayroll {

    public static void main(String[] args) throws Exception {
        ArrayList<dataKaryawan> dk = new ArrayList();
        dataKaryawan dk1 = new dataKaryawan(101, "paijo", 900, 200, 150, 75);
        dataKaryawan dk2 = new dataKaryawan(102, "lulu", 875, 200, 100, 100);
        dataKaryawan dk3 = new dataKaryawan(103, "lala", 1000, 350, 200, 125);

        ArrayList<dataAbsensi> da = new ArrayList();
        dataAbsensi da1 = new dataAbsensi(101, "2016-01-15", 08.00, 17.00);
        dataAbsensi da2 = new dataAbsensi(101, "2016-01-16", 08.00, 18.30);
        dataAbsensi da3 = new dataAbsensi(102, "2016-01-15", 08.00, 15.00);
        dataAbsensi da4 = new dataAbsensi(103, "2016-01-15", 08.00, 17.00);

        cekHari ch1 = new cekHari();
        penghitungan p1 = new penghitungan();
        p1.prosesHitung(ch1.hari(da1.getTanggal()), dk1.getGaji(), dk1.getTunjangan(), dk1.getBonus(), dk1.getDenda(), da1.getJam_masuk(), da1.getJam_pulang());

        cekHari ch2 = new cekHari();
        penghitungan p2 = new penghitungan();
        p2.prosesHitung(ch2.hari(da2.getTanggal()), dk1.getGaji(), dk1.getTunjangan(), dk1.getBonus(), dk1.getDenda(), da2.getJam_masuk(), da2.getJam_pulang());

        cekHari ch3 = new cekHari();
        penghitungan p3 = new penghitungan();
        p3.prosesHitung(ch3.hari(da3.getTanggal()), dk2.getGaji(), dk2.getTunjangan(), dk2.getBonus(), dk2.getDenda(), da3.getJam_masuk(), da3.getJam_pulang());

        cekHari ch4 = new cekHari();
        penghitungan p4 = new penghitungan();
        p4.prosesHitung(ch4.hari(da4.getTanggal()), dk3.getGaji(), dk3.getTunjangan(), dk3.getBonus(), dk3.getDenda(), da4.getJam_masuk(), da4.getJam_pulang());

        System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
        System.out.println(dk1.getNik() + "," + dk1.getNama() + "," + dk1.getGaji() + "," + dk1.getTunjangan() + "," + dk1.getBonus() + "," + dk1.getDenda() + "," + (p1.getGajiAkhir() + p2.getGajiAkhir()));
        System.out.println(dk2.getNik() + "," + dk2.getNama() + "," + dk2.getGaji() + "," + dk2.getTunjangan() + "," + dk2.getBonus() + "," + dk2.getDenda() + "," + p3.getGajiAkhir());
        System.out.println(dk3.getNik() + "," + dk3.getNama() + "," + dk3.getGaji() + "," + dk3.getTunjangan() + "," + dk3.getBonus() + "," + dk3.getDenda() + "," + p4.getGajiAkhir());
    }
}
