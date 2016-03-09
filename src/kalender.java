/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enggar Pratama
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class kalender {
    public boolean hari_libur (int tanggal){
    Date date1 = (new GregorianCalendar(2016, Calendar.JANUARY, tanggal)).getTime();
    String hasil = (new SimpleDateFormat("EEEE").format(date1));
    
    if ((hasil.equals("Sunday"))||(hasil.equals("Saturday"))){
        return true;
    }
    else{
        return false;
    }
    }
}
