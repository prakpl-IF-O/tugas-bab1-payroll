import java.util.Calendar;
public class Git {  
private int NIKKaryawan;
public static String NamaKaryawan;
private int  Gaji, Tunjangan, Bonus, Denda,Total_gaji, JamMasuk, JamKeluar;

//Gaji
int gaji ,co;
//Tanggal
int Dn , nda, sel, msel, r, u, a, ww;
Calendar Tanggal_1 = Calendar.getInstance();
Calendar Tanggal_2 = Calendar.getInstance();

    public void setTotal_gaji(int o) {
        Total_gaji = (Gaji + Tunjangan + Bonus) - Denda;   
    }
    public void setJamMasuk(int p) {
        JamMasuk = p;
    }
    public void setJamKeluar(int k) {
        JamKeluar = k;
    }
    public void setNIKKaryawan(int a) {
        NIKKaryawan = a;
    }
    public static void setNamaKaryawan(String b) {
        NamaKaryawan = b;
    }
    public void setGaji(int ca) {
        gaji = ca ;
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
    Tanggal_1.set(q,w,e,r,t,0);
    Tanggal_2.set(q,w,e,y,u,0);
    sel=y;this.r=ra;
    msel=u;this.u=u;
    
    }
    public void Display(){
        System.out.println(NIKKaryawan+"," + NamaKaryawan+","+ Gaji+"," + Tunjangan+"," + Bonus+","
        + Denda+"," + Total_gaji );
    }
}
