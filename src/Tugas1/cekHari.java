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
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class cekHari {

    public int CekHari(String a) {
        SimpleDateFormat Konvert = new SimpleDateFormat("yyyy-MM-dd");
        int b = 0;
        try {
            Date Hari = Konvert.parse(a);
            Calendar tgl = Calendar.getInstance();
            tgl.setTime(Hari);
            b = tgl.get(tgl.DAY_OF_WEEK);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return b;
    }

}
