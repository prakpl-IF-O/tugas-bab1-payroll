/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
import java.text.ParseException;
//import java.text.ParsePosition
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class kalender {
public class ceheckingcalender {
    public int ceheckingcalender(String kal){
        SimpleDateFormat ubah = new SimpleDateFormat("yyyy-MM-dd");//benerin formatnya
        int kalender = 0;
        try {
            Date Hari = ubah.parse(kal);
            Calendar cal = Calendar.getInstance();
            cal.setTime(Hari);
            kalender = cal.get(cal.DAY_OF_WEEK);
        }   
        catch (ParseException ex) {ex.printStackTrace();}
        return kalender;}
}
}
