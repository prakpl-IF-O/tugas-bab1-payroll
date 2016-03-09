/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Github;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author dwiyan
 */
public class JadwalKaryawan {
    String data[][] = new String[4][4];
    public void setJadwal() {
        Date paijo = new Date(116, 0, 15);
        Date paijo_ = new Date(116, 0, 16);
        Date lulu = new Date(116, 0, 15);
        Date lala = new Date(116, 0, 15);
        SimpleDateFormat hari = new SimpleDateFormat("yyyy-MM-dd");
        data[0][0] = "101";
        data[0][1] = hari.format(paijo);
        data[0][2] = "08:00";
        data[0][3] = "17:00";
        data[1][0] = "101";
        data[1][1] = hari.format(paijo_);
        data[1][2] = "08:00";
        data[1][3] = "18:30";
        data[2][0] = "102";
        data[2][2] = "08:00";
        data[2][3] = "15:00";
        data[2][1] = hari.format(lulu);
        data[3][0] = "102";
        data[3][1] = hari.format(lala);
        data[3][2] = "08:00";
        data[3][3] = "17:00";
    }
    public String getJadwal() {
        return data[4][4];
    }
    public void display() {
        setJadwal();
        System.out.println("nik,tanggal,jam_masuk,jam_pulang");
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data[1].length; y++) {
                System.out.print(data[x][y] + ",");
            }
            System.out.println("");
        }
    }
}
