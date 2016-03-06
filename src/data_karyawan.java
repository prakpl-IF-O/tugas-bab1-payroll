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
    private String nama;

    public void isi_nama(String _nama) {
        nama = _nama;
    }

    public void isi_nik(int _nik) {
        nik = _nik;
    }

    public void isi_gaji(int _gaji) {
        gaji = _gaji;
    }

    public void isi_tunjangan(int _tunjangan) {
        tunjangan = _tunjangan;
    }

    public void isi_bonus(int _bonus) {
        bonus = _bonus;
    }

    public void isi_denda(int _denda) {
        denda = _denda;
    }

    public int hitung_gaji() {
        return ((gaji + tunjangan + bonus) - denda);
    }
}
