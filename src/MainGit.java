import java.util.Date;
import java.util.Calendar;
public class MainGit {
    
    public static void main(String[] args) {
        Git Karyawan1=new Git();
        System.out.println("***Data Absensi Karyawan***");
        System.out.println("");
        System.out.println("Nama Beserta NIK Karyawan");
        System.out.println
        ("1. Paijo : 101\n2. Lulu  : 102\n3. Lala  : 103 ");
        System.out.println("");
        
        Karyawan1.setNIKKaryawan(101);
        Karyawan1.setNamaKaryawan("Paijo");
        Karyawan1.setGaji(900,200,150);
        Karyawan1.setDenda(75);
        Karyawan1.Calender(2016, 0, 15, 8 , 0, 17, 00);
        Karyawan1.Total_gaji();
       
        //System.out.println("");
        Git Karyawan2=new Git();
        Karyawan2.setNIKKaryawan(102);
        Karyawan2.setNamaKaryawan("Lulu");
        Karyawan2.setGaji(875,200,100);
        Karyawan2.setDenda(100);
        Karyawan1.Calender(2016, 0, 15, 8 , 0, 18, 30);
        Karyawan2.Total_gaji();
        
        //System.out.print
        Git Karyawan3=new Git();
        Karyawan3.setNIKKaryawan(103);
        Karyawan3.setNamaKaryawan("Lala");
        Karyawan3.setGaji(1000,350,200);
        Karyawan3.setDenda(125);
        Karyawan1.Calender(2016, 0, 15, 8 , 0, 17, 00);
        Karyawan3.Total_gaji();
        //Dis
        System.out.println("NIK,Nama,Gaji,Tunjangan,Bonus,Denda");
        Karyawan1.Display();
        Karyawan2.Display();
        Karyawan3.Display();
        System.out.println("");
        System.out.println("NIK,Nama,Gaji,Tunjangan,Bonus,Denda,Total Gaji");
        Karyawan1.Display2();
        Karyawan2.Display2();
        Karyawan3.Display2();
        System.out.println("");
        Karyawan1.setcal();
        Karyawan2.setcal();
        Karyawan3.setcal();
        
        
        
        
        
}
    
}
