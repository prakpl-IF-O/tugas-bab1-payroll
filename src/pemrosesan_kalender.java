/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Enggar Pratama
 */
public class pemrosesan_kalender {
    private String tanggal;
    private String bulan;
    private String tahun;
    private String hari;
    public static void main(String[] args) {
    Date date1 = (new GregorianCalendar(2016, Calendar.JANUARY, 16)).getTime();
    System.out.println(new SimpleDateFormat("EEEE").format(date1));
    }
}
