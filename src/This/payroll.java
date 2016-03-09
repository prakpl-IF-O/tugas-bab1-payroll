package This;
public class payroll {
    private String NIK, Nama;
    private int GajiPegawai, TunjanganPegawai, Bonus, Denda;
    double JamBolos;
    double JamTelat;
    double JamBonus;
    double JumlahGaji;
    double GajiKeseluruhan;
    double BonusPegawai[] = new double[2];
    double DendaPegawai[] = new double[2];
    String TanggalPegawai[] = new String[2];
    double JamMasuk[] = new double[2];
    double JamKeluar[] = new double[2];
    double TotalGaji[] = new double[2];
public void header(){
System.out.println("========================SISTEM PAYROLL=========================");
}
    public void DisplayX() {       
        System.out.println("NIK\t\t\t: " + NIK);
        System.out.println("Nama\t\t\t: " + Nama);
        System.out.println("Gaji Pokok\t\t: " + GajiPegawai);
        System.out.println("Tunjangan\t\t: " + TunjanganPegawai);
        System.out.println();
        System.out.println("Tanggal Masuk Kerja\t: " + TanggalPegawai[0]);
        System.out.println("Bonus\t\t\t: " + BonusPegawai[0]);
        System.out.println("Denda\t\t\t: " + DendaPegawai[0]);
        System.out.println("Total Pendapatan\t: " + TotalGaji[0]);
    }

    public void DisplayY() {
        System.out.println();
        System.out.println("Tanggal Masuk Kerja\t: " + TanggalPegawai[1]);
        System.out.println("Bonus\t\t\t: " + BonusPegawai[1]);
        System.out.println("Denda\t\t\t: " + DendaPegawai[1]);
        System.out.println("Total Pendapatan\t: " + TotalGaji[1]);
    }

    public int getBonus() {
        return Bonus;
    }
    public int getDenda() {
        return Denda;
    }
    public void setNIK(String a) {
        NIK = a;
    }
    public void setNama(String a) {
        Nama = a;
    }
    public void setGaji(int b) {
        GajiPegawai = b;
    }
    public int getGaji(){
        return GajiPegawai;
    }    
    public void setTunjangan(int b) {
        TunjanganPegawai = b;
    }
    public int getTunjangan(){
        return TunjanganPegawai;
    }
    public void jamMasuk(double[] x) {
        JamMasuk = x;
    }
    public void jamKeluar(double[] x) {
        JamKeluar = x;
    }
    public void setBonus(int b) {
        Bonus = b;
    }
    public void setDenda(int b) {
        Denda = b;
    }
    
    public void Denda1(double a, double b, int c) {
        if (a > 8) {
            JamTelat = a - 8;
            } else 
            { JamTelat = 0;}
        if (b < 17) {
            JamBolos = 17 - b;
            } else 
            { JamBolos = 0;
        }
        DendaPegawai[0] = JamTelat + JamBolos * c;
    }

    public void Denda2(double a, double b, int c) {
        if (a > 8) {
            JamTelat = a - 8;
            } else 
            { JamTelat = 0;}
        if (b < 17) {
            JamBolos = 17 - b;
            } else 
            { JamBolos = 0;
        }
        DendaPegawai[0] = JamTelat + JamBolos * c;
    }

    public void Bonus1(double m, int n) {
        if (m > 17) {
            JamBonus = m - 17;
            } else
            { JamBonus = 0;
        }
        BonusPegawai[0] = JamBonus * n;
    }

    public void Bonus2(double m, int n) {
        if (m > 17) {
            JamBonus = m - 17;
            } else
            { JamBonus = 0;
        }
        BonusPegawai[0] = JamBonus * n;
    }
    
    
    public void TotalGaji() {
        if (TanggalPegawai[1] == null) {
            TotalGaji[0] = (GajiPegawai + TunjanganPegawai) + BonusPegawai[0] - DendaPegawai[0];
        } else 
            { TotalGaji[1] = ((GajiPegawai + TunjanganPegawai)) + BonusPegawai[1] - DendaPegawai[1];
        }
    }

    public void GajiKeseluruhan() {
        GajiKeseluruhan = TotalGaji[0] + TotalGaji[1];
    }

    public void DisplayMessage() {
        System.out.println();
        System.out.println("Total Gaji\t\t: " + (int)GajiKeseluruhan);

    }  
}
