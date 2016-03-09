package Tugas_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tanggal {
    private int bulan, tanggal, tahun;
    private String hari;
    public boolean cekSabtuMinggu(int a, int b, int c){
        tanggal = a;
        bulan = b;
        tahun = c;
        if (bulan==1){
            Date date1 = (new GregorianCalendar(tahun, Calendar.JANUARY, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==2){
            Date date1 = (new GregorianCalendar(tahun, Calendar.FEBRUARY, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==3){
            Date date1 = (new GregorianCalendar(tahun, Calendar.MARCH, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==4){
            Date date1 = (new GregorianCalendar(tahun, Calendar.APRIL, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==5){
            Date date1 = (new GregorianCalendar(tahun, Calendar.MAY, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==6){
            Date date1 = (new GregorianCalendar(tahun, Calendar.JUNE, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==7){
            Date date1 = (new GregorianCalendar(tahun, Calendar.JULY, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==8){
            Date date1 = (new GregorianCalendar(tahun, Calendar.AUGUST, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==9){
            Date date1 = (new GregorianCalendar(tahun, Calendar.SEPTEMBER, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==10){
            Date date1 = (new GregorianCalendar(tahun, Calendar.OCTOBER, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==11){
            Date date1 = (new GregorianCalendar(tahun, Calendar.NOVEMBER, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        } else if (bulan==12){
            Date date1 = (new GregorianCalendar(tahun, Calendar.DECEMBER, tanggal)).getTime();
            hari = new SimpleDateFormat("EEEE").format(date1);
        }
        
        if (hari=="Sabtu" || hari=="Minggu"){
            return true;
        } else return false;
    }
}
