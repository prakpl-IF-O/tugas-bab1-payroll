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

    private int nik, gaji, tunjangan, bonus, denda, total_gaji, tahun, bulan, tanggal, jam_masuk, jam_pulang;
    private String nama;
    private boolean hari_libur;
    int total_bonus = 0;
    int total_denda = 0;

    public data_karyawan(int _nik, String _nama, int _gaji, int _tunjangan, int _bonus, int _denda) {
        nama = _nama;
        nik = _nik;
        gaji = _gaji;
        tunjangan = _tunjangan;
        bonus = _bonus;
        denda = _denda;
    }

    public void Absensi(int _tahun, int _bulan, int _tanggal, int _jam_masuk, int _menit_masuk, int _jam_pulang, int _menit_pulang, boolean _hari_libur) {
        tahun = _tahun;
        bulan = _bulan;
        tanggal = _tanggal;
        jam_masuk = _jam_masuk;
        jam_pulang = _jam_pulang;
        hari_libur = _hari_libur;
    }

    public int hitung_bonus() {

        if (hari_libur == false) {
            total_bonus += bonus_lembur();
            return total_bonus;
        } else {
            return ((jam_pulang - jam_masuk) * bonus);
        }
    }

    private int bonus_lembur() {
        if (jam_pulang > 17) {
            return ((jam_pulang - 17) * bonus);
        } else {
            return 0;
        }
    }

    public int hitung_denda() {

        if (hari_libur == false) {
            total_denda = denda_pulang();
            total_denda += denda_masuk();
            return total_denda;
        } else {
            return 0;
        }
    }

    private int denda_pulang() {
        if (jam_pulang >= 17) {
            return 0;
        } else {
            return (17 - jam_pulang) * denda;
        }
    }

    private int denda_masuk() {
        if (jam_masuk <= 8) {
            return 0;
        } else {
            return (jam_masuk - 8) * denda;
        }
    }

}
