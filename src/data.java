import java.util.Calendar;
public class data {
    int tg, gaji, bon,bo,de, tun, den, t, b, h,hm,mm,hos,mis,d;
    String nik, nama;
    boolean day=false;
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    public void setGaji(int gaji, int tu, int bo) {
        this.gaji = gaji;
        this.bo=bo;
        tun = tu;
        hari(d);
        if(day==true){
         bon=bo*(hos-hm);
         if(mis>29){
            bon=bon+bo/2;
        }
        }else if(hos>=17){
            bon=bo*(hos-17);
        
        if(mis>29){
            bon+=bo/2;
        }
        }
    }
    public void hari(int d){
        if(d==2||d==3){day=true;}
        else if((d-2)%7==0){
        day=true;
    }else if((d-3)%7==0){
        day=true;
    }          
    }
    public void setDen(int de) {
        this.de=de;
        if(hos<=17){
            den=de*(17-hos)+de*(hm-8);
            if(mis>29){
            den+=de/2;
        }if(hm>=8){
                if(mm>29){
            den+=de/2;
        }
        }else{
        den = 0;
        }
        
    }    
    }
    public void calendar(int y,int m,int d, int hm, int mm,int hs,int ms){
        cal1.set(y, m, d, hm, mm,0);
        cal2.set(y,m,d,hs,ms,0);
        this.d=d;
        hos=hs;this.hm=hm;
        mis=ms;this.mm=mm;
    }
    public void setcal(){
        System.out.println("nik: "+nik+"\nstart\n"+cal1.getTime()+"\nend\n"+cal2.getTime());
    }
    public void setNaNik(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }
    public void totalgaji() {
        tg = gaji + tun + bon - den;
    }
    public void show() {       
        System.out.println(nik + "," + nama + "," + gaji + "," + tun + "," + bo + "," + de);
    }
    public void showtg() {        
        System.out.println(nik + "," + nama + "," + gaji + "," + tun + "," + bon + "," + den + "," + tg);
    }
}
