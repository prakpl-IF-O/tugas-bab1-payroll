package github; 
    import java.util.Date;
    import java.text.SimpleDateFormat;
    import java.text.ParseException;
    import java.util.Calendar;

public class hari {
public int Hari(String harii){
SimpleDateFormat A=new SimpleDateFormat("yyyy-MM-dd");
int d=100;
try{
    Date hari=A.parse( harii);
    Calendar a=Calendar.getInstance();
    a.setTime(hari);
    d=a.get(a.DAY_OF_WEEK);
}
catch(ParseException x){
    x.printStackTrace();
}
return d;
}    
}
