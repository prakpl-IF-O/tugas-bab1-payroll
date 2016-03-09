public class daker {
    private int nik;
    private String tanggal;
    private double jamkerja;
    private double jampulang;
    public daker( int nik, String tanggal,double jam_kerja, double jam_pulang) {
        this.nik = nik;
        this.tanggal = tanggal;
        this.jamkerja = jam_kerja;
        this.jampulang = jam_pulang; }
    public int getNik() {
        return nik;}
    public String getTanggal() {
        return tanggal;}
    public double getJamker() {
        return jamkerja;}
    public double getJampul() {
        return jampulang;}
    }