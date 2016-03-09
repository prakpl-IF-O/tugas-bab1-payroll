import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
// source code sebagian besar dari dapat referensi dari internet
//CH =Cek Hari
public class carihari {
    public int CH(String a){
        SimpleDateFormat rubah = new SimpleDateFormat("yyyy-MM-dd");
        int b = 0;
        try { Date Hari = rubah.parse(a);
            Calendar tgl = Calendar.getInstance();
            tgl.setTime(Hari);
            b = tgl.get(tgl.DAY_OF_WEEK);
        } catch (ParseException ex) {
            ex.printStackTrace();}
        return b;}
   }
