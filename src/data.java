import java.util.Calendar;
public class data {
    int tg, gaji, bon,bo,de, tun, den, t, b, h,hm,mm,hos,mis,i;
    String nik, nama;
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    public void setGaji(int gaji, int tu, int bo) {
        this.gaji = gaji;
        this.bo=bo;      
        if(hos>17){
            bon=bo*(hos-17);
        }else if(i==cal1.FRIDAY){
         bon=bo*(hos-hm);   
        }else{
        bon = 0;
        }
        if(mis>29){
            bon+=bo/2;
        }
        tun = tu;
    }
    public void setDen(int de) {
        this.de=de;
        if(hos<17||hm>8){
            den=de*(17-hos)+de*(hm-8);
        }else{
        den = 0;
        }
        if(mis>29||mm>29){
            den+=de/2;
        }
    }
    public void calendar(int y,int m,int d, int hm, int mm,int hs,int ms){
        cal1.set(y, m, d, hm, mm,0);
        cal2.set(y,m,d,hs,ms,0);
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
