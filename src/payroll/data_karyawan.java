public class data_karyawan{
    //modifier
    private String nama;
    private int nik;
    private int gaji;
    private int tunjangan;
    private int bonus;
    private int denda;
    
    public data_karyawan( int b,String a,int c,int d, int e, int f){
    nama=a; nik=b; gaji=c; tunjangan=d; bonus=e; denda=f;}
    public String getNama() {
        return nama;}
    public int getNik() {
        return nik;}
    public int getGaji() {
        return gaji;}
    public int getTunjangan() {
        return tunjangan;}
    public int getBonus() {
        return bonus;}
    public int getDenda() {
        return denda;}
    public void TampilAkhir(){ 
        System.out.printf("%d\t%s\t%d\t%d\t\t%d\t%d\t",nik,nama,gaji,tunjangan,bonus,denda);}}

