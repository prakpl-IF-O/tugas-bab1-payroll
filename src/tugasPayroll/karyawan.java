package tugasPayroll;
public class karyawan {
private String nik;
private String nama;
private int gaji;
private int tunjangan;
private int bonus;
private int denda;

    public void data(String nik, String nama, int gaji, int tunjangan, int bonus, int denda){
        this.nik = nik;
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;
    }
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }

    }
