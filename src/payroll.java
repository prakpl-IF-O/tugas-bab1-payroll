public class payroll {
    private String Nik;
    private String Nama;
    private int Gaji;
    private int Tunjangan;
    private int Bonus;
    private int Denda;
    private double TotalGaji;
    private int jmlDenda;
    private double jmlBonus;
    
    public void setNik (String s){
        Nik=s;
    }
    public String getNik(){
        return Nik;
    }
    public void setNama (String s){
        Nama=s;
    }
    public String getNama(){
        return Nama;
    }
    public void setGaji (int x){
        Gaji=x;
    }
    public int getGaji(){
        return Gaji;
    }
    public void setTunjangan (int x){
        Tunjangan=x;
    }
    public int getTunjangan(){
        return Tunjangan;
    }
    
    public void setBonus(int x){
        Bonus=x;
    }
    public int getBonus(){
        return Bonus;
    }
    public void setBonusgaji(int h){
        
    }
    public void setDenda(int x){
        Denda=x;
    }
    public void setjmlDenda(int n){
        jmlDenda=n*Denda;
    }
    public int getjmlDenda(){
        return jmlDenda;
    }
    public void setjmlBonus(double n){
        jmlBonus=n*Bonus;
    }
    public double getjmlBonus(){
        return jmlBonus;
    }
    public int getDenda(){
        return Denda;
    }
    public double TotalGaji(){
        TotalGaji=(Gaji+Tunjangan+jmlBonus)-jmlDenda;
        return TotalGaji;
    }
    public void DisplayMessage(){
        System.out.printf("%s %7s %10d %10d %10d %10d ",Nik,Nama,Gaji,Tunjangan,Bonus,Denda);
        System.out.println("\t"+(int)TotalGaji);
    }
}
