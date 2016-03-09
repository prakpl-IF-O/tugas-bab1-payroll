/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Kenank
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
public class Hari {
    public int Hari(String x){
        SimpleDateFormat ganti = new SimpleDateFormat("YYYY-MM-DD");
        int y=0;
        try{Date Hari=ganti.parse(x);
        Calendar tanggal =  Calendar.getInstance();
        tanggal.setTime(Hari);
        y=tanggal.get(tanggal.DAY_OF_WEEK);
        } 
        catch (ParseException ex){
            ex.printStackTrace();
        }
        return y;
    }
    public void Hari(){
    }}
