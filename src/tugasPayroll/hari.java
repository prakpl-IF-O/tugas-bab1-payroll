package tugasPayroll;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Date;
public class hari {
    
    public int hari(String x){
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        int x1 = 0;
        try {
            Date tanggal1 = tanggal.parse(x);
            Calendar x2 = Calendar.getInstance();
            x2.setTime(tanggal1);
            x1 = x2.get(x2.DAY_OF_WEEK);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return x1;
    }
    
}
