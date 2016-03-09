import java.util.Calendar;
public class Git {  
private int NIKKaryawan;
public static String NamaKaryawan;
private int  Gaji, Tunjangan, Bonus, Denda,Total_gaji, JamMasuk, JamPulang, Calender;
//campur
boolean HARI=false;
int yes, cc,no,MM;

//Gaji
int gaji ,co;
//Tanggal
int Dn , nda, sel, msel, r, u, a, ww;
Calendar Tanggal_1 = Calendar.getInstance();
Calendar Tanggal_2 = Calendar.getInstance();

    public void setTotal_gaji(int o) {
        Total_gaji = (Gaji + Tunjangan + Bonus) - Denda;   
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
        yes=cb;
        days(no);
        boolean HARI=false;
        if (HARI==true){
        MM=cc*(sel-r);
        if(msel>29){
        MM=MM+cc/2;
        }
        }else if(sel>=17){
        MM=cc*(sel-17);
        if(msel>29){
        MM+=cc/2;
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
        if (Dn < 17){
    }
        nda=f;
    }
    // Public Calender
    public void Calender (int q, int w , int e, int ra ,int t ,int y ,int u ){
    Tanggal_1.set(q,w,e,ra,t,0);
    Tanggal_2.set(q,w,e,y,u,0);
    sel=y;this.r=ra;
    msel=u;this.u=u;
    }
    public void Display(){
        System.out.println(NIKKaryawan+"," + NamaKaryawan+","+ Gaji+"," + Tunjangan+"," + Bonus+","
        + Denda+"," + Total_gaji );
        System.out.println(NIKKaryawan+"," + Calender + ","+ JamMasuk+","+ JamPulang+"," );
    }
}
