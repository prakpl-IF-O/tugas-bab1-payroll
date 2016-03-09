public class Karyawan {

    public String Nik;
    public String Nama;
    public int Gaji;
    public int Tunjangan;
    public int Bonus;
    public int Denda;
    public int Total_Gaji;
    public String Tanggal;
    public int Jam_masuk;
    public int Jam_pulang;

    public void setNama(String n) {
        Nama = n;
    }

    public void setNIK(String i) {
        Nik = i;
    }

    public void setGaji(int g) {
        Gaji = g;
    }

    public void setTunjangan (int t){
        Tunjangan = t;
    }
    
    public void setBonus(int b){
        Bonus = b;
    }
    
    public void setDenda(int d){
        Denda = d;
    }
    
    public void setTotalgaji(){
        Total_Gaji = (Gaji + Tunjangan + Bonus) - Denda;
    }
    
    public void displayMessage(){
        System.out.println("Nik | Nama | Gaji | Tunjangan | Bonus | Denda | Total Gaji");
        System.out.println(Nik + " | "+ Nama + " | " + Gaji + " | " + Tunjangan + " | " + Bonus + " | " + Denda + " | " + Total_Gaji);
    }
    
}
