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
        System.out.println("NIK,Nama,Gaji,Tunjangan,Bonus,Denda,Total Gaji");
        Karyawan1.setNIKKaryawan(101);
        Karyawan1.setNamaKaryawan("Paijo");
        Karyawan1.setGaji(900);
        Karyawan1.setTunjangan(200);
        Karyawan1.setBonus(150);
        Karyawan1.setDenda(75);
        Karyawan1.setTotal_gaji(2600);
        Karyawan1.Display();
        //System.out.println("");
        Git Karyawan2=new Git();
        Karyawan2.setNIKKaryawan(102);
        Karyawan2.setNamaKaryawan("Lulu");
        Karyawan2.setGaji(875);
        Karyawan2.setTunjangan(200);
        Karyawan2.setBonus(100);
        Karyawan2.setDenda(100);
        Karyawan2.setTotal_gaji(875);
        Karyawan2.Display();
        //System.out.println("");
        Git Karyawan3=new Git();
        Karyawan3.setNIKKaryawan(103);
        Karyawan3.setNamaKaryawan("Lala");
        Karyawan3.setGaji(1000);
        Karyawan3.setTunjangan(350);
        Karyawan3.setBonus(200);
        Karyawan3.setDenda(125);
        Karyawan3.setTotal_gaji(1350);
        Karyawan3.Display();
        
        
}
    
}
