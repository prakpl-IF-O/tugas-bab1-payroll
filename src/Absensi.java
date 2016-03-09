package mainpayroll;
import java.util.Calendar;
public class Absensi {
    private int Nik;
    private String Tanggal, JamMasuk, JamPulang;
    private int tahun, bulan, tanggal;
    
    Absensi (int nik, String tgl, String jm, String jp){
        Nik = nik;
        Tanggal = tgl;
        JamMasuk = jm;
        JamPulang = jp;
    }
    public void dataAbsensi(){
        System.out.println(Nik+ "," + Tanggal + "," + JamMasuk + "," + JamPulang);
    }
}

