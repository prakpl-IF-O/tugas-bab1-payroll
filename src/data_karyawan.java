/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfandi
 */
public class data_karyawan {

    private int nik, gaji, tunjangan, bonus, denda, total_gaji;

    private int tahun[] = new int[100];
    private int bulan[] = new int[100];
    private int tanggal[] = new int[100];
    private int jam_masuk[] = new int[100];
    private String menit_masuk[] = new String[100];
    private int jam_pulang[] = new int[100];
    private String menit_pulang[] = new String[100];
    private int nik_absen[] = new int[100];
    private boolean hari_libur[] = new boolean[100];
    int index = 0;
    int jumlah_absen=0;
    
    private String nama;
    int total_bonus;
    int total_denda;

    public data_karyawan(int _nik, String _nama, int _gaji, int _tunjangan, int _bonus, int _denda) {
        nama = _nama;
        nik = _nik;
        gaji = _gaji;
        tunjangan = _tunjangan;
        bonus = _bonus;
        denda = _denda;
    }

    public void Absensi(int _nik, int _tahun, int _bulan, int _tanggal, int _jam_masuk, String _menit_masuk, int _jam_pulang, String _menit_pulang, boolean _hari_libur) {
        nik_absen[index] = _nik;
        tahun[index] = _tahun;
        bulan[index] = _bulan;
        tanggal[index] = _tanggal;
        jam_masuk[index] = _jam_masuk;
        menit_masuk[index] = _menit_masuk;
        jam_pulang[index] = _jam_pulang;
        menit_pulang[index] = _menit_pulang;
        hari_libur[index] = _hari_libur;
        index++;
    }
    
    public void rekap_absen (){
        for (int x = 0; x < 100; x++) {
            if (nik_absen[x]!=0) {
                jumlah_absen++;
            }
        }
        tampilkan_rekap();
    }
    
    private void tampilkan_rekap (){
        System.out.println("Rekapitulasi Absen  ");
        System.out.println("  Nama               : " + nama);
        System.out.println("  Absen sebanyak     : " + jumlah_absen + " kali");
        System.out.println("  Pada tanggal       : ");

        for (int y = 0; y < jumlah_absen; y++) {
            System.out.println("     " + (y+1) + ". " + tanggal[y] + "-" + bulan[y] + "-" + tahun[y]);
            System.out.println("        " + jam_masuk[y] + ":" + menit_masuk[y] + " sampai " + jam_pulang[y] + ":" + menit_pulang[y]);
        }
        
        System.out.println("  Gaji       : "+ gaji);
        System.out.println("  Tunjangan  : "+ tunjangan);
        System.out.println("  Bonus      : "+ hitung_bonus());
        System.out.println("  Denda      : "+ hitung_denda());
        System.out.println("  Total Gaji : "+ hitung_total_gaji());
        System.out.println("");
    }
    
    public int hitung_total_gaji (){
        return ((gaji + tunjangan + hitung_bonus()) - hitung_denda());
    }
    
    public int hitung_bonus() {
        total_bonus = 0;
        for (int z = 0; z < jumlah_absen; z++) {
            if (hari_libur[z] == false) {
                if (jam_pulang[z] > 17) {
                    total_bonus += ((jam_pulang[z] - 17) * bonus);
                } else {
                    total_bonus += 0;
                }
            } else {
                total_bonus += ((jam_pulang[z] - jam_masuk[z]) * bonus);
            }
        }
        return total_bonus;
    }
    
    public int hitung_denda(){
        total_denda = 0;
        for (int w = 0; w < jumlah_absen; w++) {
            if (hari_libur[w] == false) {
                total_denda += denda_pulang(w);
                total_denda += denda_masuk(w);
            } else {
                total_denda += 0;
            }
        }
        return total_denda;
    }

    private int denda_pulang(int index) {
        if (jam_pulang[index] >= 17) {
            return 0;
        } else {
            return (17 - jam_pulang[index]) * denda;
        }
    }

    private int denda_masuk(int index) {
        if (jam_masuk[index] <= 8) {
            return 0;
        } else {
            return (jam_masuk[index] - 8) * denda;
        }
    }
}
