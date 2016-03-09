package tugas1;

public class DataKaryawan {

    private String nik, nama;
    private int gajiPegawai, tunjanganPegawai;
    double bonusPegawai[] = new double[2];
    double dendaPegawai[] = new double[2];
    private String tanggalPegawai[] = new String[2];
    private double jamMasuk[] = new double[2];
    private double jamKeluar[] = new double[2];
    
    public void setNik(String n){
        nik = n;
    }
    
    public void setNama (String n){
        nama = n;
    }
    
    public void setGaji(int x){
        gajiPegawai=x;
    }
    
    public void setTunjangan (int x){
        tunjanganPegawai=x;
    }
    
    public void setTanggal(String[] x){
        tanggalPegawai= x;
    } 
    
    public void jamMasuk(double[] x){
        jamMasuk=x;
    }
    
    public void jamKeluar(double[] x){
        jamKeluar=x;
    }
    
}


