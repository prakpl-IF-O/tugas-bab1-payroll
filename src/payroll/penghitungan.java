/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Faza Abdi
 */
public class penghitungan {

    double gajiAkhir, dendaTelat, dendaPulcep, bonusHoliday, bonusPulang;

    public void prosesHitung(String today, int gaji, int tunjangan, int bonus, int denda, double jam_masuk, double jam_pulang) {
        if (today.equals("minggu") || today.equals("sabtu")) {
            double lamaKerja;
            lamaKerja = (jam_pulang - jam_masuk) - 0.30;
            if (lamaKerja % 2 == 0) {
                bonusHoliday = (jam_pulang - jam_masuk + 0.2) * bonus;
                gajiAkhir = bonusHoliday;
            } else {
                bonusHoliday = (jam_pulang - jam_masuk) * bonus;
                gajiAkhir = bonusHoliday;
            }
        } else {
            double dt, dp, bp;
            dt = (8.00 - jam_masuk) - 30;
            dp = (17.00 - jam_pulang) - 30;
            bp = (jam_pulang - 17.00) - 30;
            if (jam_masuk > 8.00) {
                if (dt % 2 == 0) {
                    dendaTelat = (8.00 - (jam_masuk + 0.2)) * denda;
                } else {
                    dendaTelat = (8.00 - jam_masuk) * denda;
                }
            }
            if (jam_pulang < 17.00) {
                if (dp % 2 == 0) {
                    dendaPulcep = (17.00 - (jam_pulang + 0.2)) * denda;
                } else {
                    dendaPulcep = (17.00 - jam_pulang) * denda;
                }
            }
            if (jam_pulang > 17.00) {
                if (bp % 2 == 0) {
                    bonusPulang = ((jam_pulang + 0.2) - 17.00) * bonus;
                } else {
                    bonusPulang = (jam_pulang - 17.00) * bonus;
                }
            }
            gajiAkhir = (gaji + tunjangan + bonus) - (dendaTelat + dendaPulcep);
        }
    }

    public double getGajiAkhir() {
        return gajiAkhir;
    }
}
