package github;
public class absensi {
    private String nik;
    private String tanggal;
    private double jam_masuk;
    private double jam_pulang; 
    
    public void absensi(String Nik, String Tanggal, double Jam_Masuk, double Jam_Pulang ){
            nik=Nik;
            tanggal=Tanggal;
            jam_masuk=Jam_Masuk;
            jam_pulang=Jam_Pulang;
    } 

    public String getNik() {
        return nik;
    }

    public String getTanggal() {
        return tanggal;
    }

    public double getJam_masuk() {
        return jam_masuk;
    }

    public double getJam_pulang() {
        return jam_pulang;
    }
    
}
