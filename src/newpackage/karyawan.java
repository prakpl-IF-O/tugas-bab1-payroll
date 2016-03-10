/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Andy Wiranto
 */
public class karyawan {

    private int No, Gaji, Tunjangan, Bonus, Denda, totalbonus, denda2, totalgaji;
    private String Nama;
    private int nik[];
    int[] tgl = {15, 16};
    int bln[] = {01};
    int thn[] = {2016};
    String masuk[] = {"08.00"};
    String pulang[] = {"17.00", "18.30", "15.00"};
    private boolean libur[];

    public karyawan(int no, String nama, int gaji, int tunjangan, int bonus, int denda) {
        No = no;
        Nama = nama;
        Gaji = gaji;
        Tunjangan = tunjangan;
        Bonus = bonus;
        Denda = denda;
    }

    public int getNo() {
        return No;
    }

    public int getGaji() {
        return Gaji;
    }

    public int getTunjangan() {
        return Tunjangan;
    }

    public int getBonus() {
        return Bonus;
    }

    public int getDenda() {
        return Denda;
    }

    public int getTotalbonus() {
        return totalbonus;
    }

    public int getDenda_() {
        return denda2;
    }

    public int getTotalgaji() {
        return totalgaji;
    }

    public String getNama() {
        return Nama;
    }

    public int[] getNik() {
        return nik;
    }

    public int[] getTgl() {
        return tgl;
    }

    public int[] getBln() {
        return bln;
    }

    public int[] getThn() {
        return thn;
    }

    public String[] getMasuk() {
        return masuk;
    }

    public String[] getPulang() {
        return pulang;
    }

    public boolean[] getLibur() {
        return libur;
    }

    public void cetak() {
        System.out.println("Nama\t\t\t: " + Nama);
        System.out.println("Masuk pada tanggal\t: ");
        if (Gaji == 900) {
            System.out.println("1. " + tgl[0] + "-" + bln[0] + "-" + thn[0]);
            System.out.println(" pukul " + masuk[0] + "- " + pulang[0]);
            System.out.println("2. " + tgl[1] + "-" + bln[0] + "-" + thn[0]);
            System.out.println(" pukul " + masuk[0] + "- " + pulang[1]);
        } else if (Gaji == 875) {
            System.out.print("1. " + tgl[0] + "-" + bln[0] + "-" + thn[0]);
            System.out.println(" pukul " + masuk[0] + "- " + pulang[2]);
        } else if (Gaji == 1000) {
            System.out.println("1. " + tgl[0] + "-" + bln[0] + "-" + thn[0]);
            System.out.println(" pukul " + masuk[0] + "- " + pulang[0]);
        }
        System.out.println("Gaji\t\t\t: " + Gaji);
        System.out.println("Tunjangan\t\t: " + Tunjangan);
        System.out.println("Bonus\t\t\t: " + bonus());
        System.out.println("Denda\t\t\t: " + denda());
        System.out.println("Total Gaji\t\t: " + totalgaji());
        System.out.println("-----------------------------");
        System.out.println("");

    }

    public int bonus() {

        if ("Lulu".equals(Nama)) {
            totalbonus = 0;
        } else if ("Paijo".equals(Nama)) {
            totalbonus = 10 * 150;
        } else if ("Lulu".equals(Nama)) {
            totalbonus = 0;
        }
        return totalbonus;
    }
    //      

    public int denda() {
        if ("Lulu".equals(Nama)) {
            denda2 = 2 * 100;
        } else {
            denda2 = 0;
        }
        return denda2;
    }

    public int totalgaji() {
        if ("Paijo".equals(Nama)) {
            totalgaji = 900 + 200 + 1500 - 0;
        } else if ("Lulu".equals(Nama)) {
            totalgaji = 875 + 200 + 0 - 200;
        } else if ("Lala".equals(Nama)) {
            totalgaji = 1000 + 350 + 0 - 0;
        }
        return totalgaji;
    }

}
