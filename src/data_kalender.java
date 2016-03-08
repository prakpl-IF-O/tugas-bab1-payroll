/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfandi
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class data_kalender {

    private int tanggal, bulan, tahun;
    private String day;

    //kode mengecek hari dari tanggal
    //inti kode didapat dari http://www.java2s.com/Code/Java/Development-Class/Getthedayname.htm]
        
    public boolean cek_libur(int _tanggal, int _bulan, int _tahun) {
        tanggal = _tanggal;
        bulan = _bulan;
        tahun = _tahun;

        switch (bulan) {
            case 1:
                Date date1 = (new GregorianCalendar(tahun, Calendar.JANUARY, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 2:
                date1 = (new GregorianCalendar(tahun, Calendar.FEBRUARY, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 3:
                date1 = (new GregorianCalendar(tahun, Calendar.MARCH, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 4:
                date1 = (new GregorianCalendar(tahun, Calendar.APRIL, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 5:
                date1 = (new GregorianCalendar(tahun, Calendar.MAY, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 6:
                date1 = (new GregorianCalendar(tahun, Calendar.JUNE, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 7:
                date1 = (new GregorianCalendar(tahun, Calendar.JULY, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 8:
                date1 = (new GregorianCalendar(tahun, Calendar.AUGUST, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 9:
                date1 = (new GregorianCalendar(tahun, Calendar.SEPTEMBER, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 10:
                date1 = (new GregorianCalendar(tahun, Calendar.OCTOBER, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 11:
                date1 = (new GregorianCalendar(tahun, Calendar.NOVEMBER, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
            case 12:
                date1 = (new GregorianCalendar(tahun, Calendar.DECEMBER, tanggal)).getTime();
                day = new SimpleDateFormat("EEEE").format(date1);
                break;
        }
        if ((day.equals("Sabtu")) || (day.equals("Minggu")) || (day.equals("Saturday")) || (day.equals("Sunday"))) {
            return true;
        } else {
            return false;
        }
    }
}
