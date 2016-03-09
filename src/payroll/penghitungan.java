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
           
        }
    }
}
