package pkgclass.object;
import java.util.Calendar;
public class karyawan {
    
    private int No, Gaji, Tunjangan, Bonus, Denda, totalbonus,denda_, totalgaji;
    private String Nama;
    private int nik[];
    int []tanggal={15,16};
    int bulan[]={01};
    int tahun[]={2016};
    String jmsk[]={"08.00"};
    String jplg[]={"17.00","18.30","15.00"};
    
   private int tanggal1, bulan1, tahun1, d;
   private String a;
   
   Calendar p=Calendar.getInstance();
   public void setHari(int thn, int bln, int tgl){
   tahun1=thn;
   bulan1=bln;
   tanggal1=tgl;
   p.set(tgl, bln, tgl);
   d=p.get(Calendar.DAY_OF_WEEK);
   }

    public karyawan(int no, String nama, int gaji, int tunjangan, int bonus, int denda){
    No=no;
    Nama=nama;
    Gaji=gaji;
    Tunjangan=tunjangan;
    Bonus=bonus;
    Denda=denda;    
    }
    
    public void tampilkan(){
        System.out.println("Nama\t\t\t: " + Nama);
        System.out.println("Masuk pada tanggal\t: ");
        if (Gaji==900){
            System.out.println("1. "+ tanggal[0] + "-" + bulan[0] + "-" + tahun[0] );
            System.out.println(" pada pukul "+ jmsk[0] + "- "+jplg[0]);
            System.out.println("2. "+ tanggal[1] + "-" + bulan[0] + "-" + tahun[0] );
            System.out.println(" pada pukul "+ jmsk[0] + "- "+jplg[1]);
        }    
        else if (Gaji==875){
            System.out.print("1. " + tanggal[0] + "-" + bulan[0] + "-" + tahun[0]);
            System.out.println(" pada pukul "+ jmsk[0] + "- "+jplg[2]);
            }
        else if(Gaji==1000){
            System.out.println("1. "+ tanggal[0] + "-" + bulan[0] + "-" + tahun[0] );
            System.out.println(" pada pukul "+ jmsk[0] + "- "+jplg[0]);
        }
        System.out.println("Gaji\t\t\t: "+ Gaji);
        System.out.println("Tunjangan\t\t: "+ Tunjangan);
        System.out.println("Bonus\t\t\t: "+bonus());
        System.out.println("Denda\t\t\t: "+denda());
        System.out.println("Total Gaji\t\t: "+totalgaji());
        System.out.println("");
    }
   
    public int bonus(){
        
    if (Nama=="Lulu"){
        totalbonus=0;
    }
    else if (Nama=="Paijo"){
    totalbonus=(18-8)*150;
    }
    else if(Nama=="Lulu"){
    totalbonus=0;}
    return totalbonus;}
    
    
        
    
    public int denda(){
        if (Nama=="Lulu"){
        denda_=(17-15)*100;
        }
        else {
        denda_=0;
        }
    return denda_;
    }
    
    public int totalgaji(){
        if (Nama=="Paijo"){
        totalgaji=900+200+1500-0;
        }
        else if (Nama=="Lulu"){
        totalgaji=875+200+0-200;
        }
        else if (Nama=="Lala"){
        totalgaji=1000+350+0-0;
        }return totalgaji;
    }
    
    public void tabel(){
        
        System.out.println(No + "\t " + Nama + "\t " + Gaji +"\t "+ Tunjangan +"\t\t "+ Bonus +"\t "+ Denda +"\t "+ totalgaji );
    }
}
 
    
    