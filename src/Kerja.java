public class Kerja {
    private String Nama;
    private String nik;
    private double gaji;
    private double tunjangan;
    private double bonus;
    private double denda;
    private double denda1;
    private double denda2;
    private double denda3;
    private int tanggal;
    private int bulan;
    private int tahun;
    private double jammsk;
    private double jamplg;
    private double total;
    
    public void setKaryawan (String n,String a, double y, double o){
        Nama = n;
        nik=a;
        gaji=o;
        tunjangan=o;
    }
    public void setAbsensi(int t,int b, int x, double j, double i){
        tanggal=t;
        bulan=b;
        tahun=x;
        jammsk=j;
        jamplg=i;
        
    }
    public void getBonus(){
        if ( tanggal==16||tanggal==17||tanggal==2||tanggal==3||tanggal==9||
                tanggal==10||tanggal==23||tanggal==24||tanggal==30||
                tanggal==31){
            bonus=(jamplg-jammsk)*50;
        } else {
        if ( jamplg > 17){
        bonus=(jamplg-17) * 50;   
    } else {
            bonus=0;
        }
    } if ( tanggal==16||tanggal==17){
            bonus=(jamplg-jammsk)*50;
        } 
        }
    public void getDenda (){
        if ( tanggal==15||tanggal==14){
        denda1= jammsk-8;
        denda2= 17 - jamplg;
        if (jamplg < 17 && jammsk > 8){
            denda=(denda1+denda2) * 50;
        } 
        else if ( jammsk<8&&jamplg < 17) {
          denda=denda2*50;  
        } 
        else if ( jammsk > 8 && jamplg > 17){
            denda=denda1*50 ;
        } 
        else if (jammsk==8&&jamplg<17){
            denda=denda2*50;
        }
        else if ( jammsk>8&&jamplg==17){
            denda=denda1*50;
        } else {
            denda=0;
        }
    } else {
            denda=0;
        }
        }
    public void getTotal(){
        total=( gaji+tunjangan+bonus)-denda;
        
    }
    public void display (){
        System.out.println("Nama Karyawan   :"+ Nama);
        System.out.println("Nik Karyawan    :"+ nik);
        System.out.println("Pada tanggal    :"+tanggal+"-"+bulan+"-"+tahun);
        System.out.println("Masuk Jam       :"+jammsk);
        System.out.println("Pulang jam      :"+jamplg);
        System.out.println("Gaji Karyawan   :"+ gaji);
        System.out.println("Tunjangan       :"+tunjangan);
        System.out.println("Bonus           :"+bonus);
        System.out.println("Denda           :"+denda);
        System.out.println("Total Gaji      :"+total);
    }
    
}
