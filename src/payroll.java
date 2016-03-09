public class payroll {
    private String Nik;
    private String Nama;
    private int Gaji;
    private int Tunjangan;
    private int Bonus;
    private int Denda;
    private int TotalGaji;
            
    
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
    public void setDenda(int x){
        Denda=x;
        TotalGaji();
    }
    public int getDenda(){
        return Denda;
    }
    public int TotalGaji(){
        TotalGaji=(Gaji+Tunjangan+Bonus)-Denda;
        return TotalGaji;
    }
    public void setTelat(int n){
        
    }
    public void DisplayMessage(){
        
        System.out.println(Nik+"\t"+Nama+"\t"+Gaji+"\t"+Tunjangan+"\t"+Bonus+"\t"+Denda+"\t"+TotalGaji);
    }
}
