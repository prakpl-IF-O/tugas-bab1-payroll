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
    
    public void display(){
        System.out.print(nik+"  ");
        System.out.print(nama+"  ");
        System.out.print(tunjangan+"  ");
        System.out.print(bonus+"  ");
        System.out.print(denda+"  ");
    }

    }
