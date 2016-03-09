import java.util.Calendar;
public class Git {  
private int NIKKaryawan;
public static String NamaKaryawan;
private int  gaji, Tunjangan, Bonus, Denda,Total_gaji, JamMasuk, JamPulang, Calender;
//campuran
boolean HARI=false;
int cc,no,co;
//Tanggal
int Dn ,sel, msel, r, u, a, ww, f;
Calendar Tanggal_1 = Calendar.getInstance();
Calendar Tanggal_2 = Calendar.getInstance();
    public void Total_gaji() {
        Total_gaji = (gaji + Tunjangan + Bonus) - Denda;   
    }
    public void days(int g){
        if(g==2 || g==3){HARI=true;}
        else if ((g-2)%7==0){
        HARI=true;
        }else if ((g-3)%7==0){
        HARI=true;
        }
    }
    public void setJamMasuk(int p) {
        JamMasuk = p;
    }
    public void setJamPulang(int k) {
        JamPulang = k;
    }
    public void setNIKKaryawan(int a) {
        NIKKaryawan = a;
    }
    public static void setNamaKaryawan(String b) {
        NamaKaryawan = b;
    }
    public void setGaji(int ca,int cb,int cc) {
        gaji = ca ;
        this.cc=cc;
        Tunjangan=cb;
        days(no);
        if (HARI==true){
        Bonus=cc*(sel-r);
        if(msel>29){
        Bonus=Bonus+cc/2;
        }
        }else if(sel>=17){
        Bonus=cc*(sel-17);
        if(msel>29){
        Bonus+=cc/2;
        }
        }
    }
    public void setTunjangan(int d) {
        Tunjangan = d;
    }
    public void setBonus(int e) {
        Bonus = e;
    }
    
    public void setDenda(int f) {
        this.f=f;
        if(sel<=17){
        Denda=f*(17-sel)+f*(r-8);
        if (msel>29){
        Denda+=f/2;
        }
        if(r>=8){
        if(u>29){
        Denda+=f/2;
        }
        }else{
        Denda = 0;
        }
        }
    }
    // Public Calender
    public void Calender (int q, int w , int e, int ra ,int t ,int y ,int u ){
    Tanggal_1.set(q, w, e , ra, t, 0);
    Tanggal_2.set(q, w, e, y, u, 0);
    sel=y;this.r=ra;
    msel=u;this.u=u;
    }
    public void setcal(){
        System.out.println("NIK"+ NIKKaryawan);
        System.out.println("Mulai "+ Tanggal_1.getTime());
        System.out.println("Stop "+ Tanggal_2.getTime());
    }
    public void Display(){
        
        System.out.println(NIKKaryawan+"," + NamaKaryawan+","+ gaji+"," + Tunjangan+"," + cc+","
        + f);
    }
    public void Display2(){
        
        System.out.println(NIKKaryawan+"," + NamaKaryawan + ","+ gaji+","+ Tunjangan+","+ Bonus+","+Denda+","+Total_gaji);
    }
}

