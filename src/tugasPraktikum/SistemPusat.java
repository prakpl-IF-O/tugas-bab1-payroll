package tugasPraktikum;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class SistemPusat {
    public static void main(String[] args) {
        Date date=new Date();
        Scanner in=new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd,HH:mm");
        Karyawan k0=new Karyawan();
        Karyawan k1=new Karyawan();
        Karyawan k2=new Karyawan();
        
        k0.setNama("Jenes");
        k0.setGaji(1200);
        k0.setDenda(100);
        k0.setBonus(200);
        k0.setNik(101);
        k0.setTunjangan(500);
        
        k1.setNama("Krisanti");
        k1.setNik(102);
        k1.setGaji(1500);
        k1.setBonus(300);
        k1.setTunjangan(600);
        k1.setDenda(200);
        
        k2.setNama("Narto");
        k2.setNik(103);
        k2.setGaji(1800);
        k2.setBonus(300);
        k2.setTunjangan(700);
        k2.setDenda(200);
        
        System.out.println(k0.getNik()+","+k0.getNama()+","+k0.getGaji()+","+k0.getTunjangan()+","+k0.getBonus()+","+k0.getDenda());
        System.out.println(k1.getNik()+","+k1.getNama()+","+k1.getGaji()+","+k1.getTunjangan()+","+k1.getBonus()+","+k1.getDenda());
        System.out.println(k2.getNik()+","+k2.getNama()+","+k2.getGaji()+","+k2.getTunjangan()+","+k2.getBonus()+","+k2.getDenda());
    int a;
        System.out.println("Lakukan presensi masuk");
        do{
        System.out.println("Masukkan nik :");
        a=in.nextInt();
        if(a==k0.getNik())
        System.out.println(k0.getNik()+","+k0.getNama()+","+sdf.format(date));
        
        else if(a==k1.getNik())
            System.out.println(k1.getNik()+","+k1.getNama()+","+sdf.format(date));
        else if (a==k2.getNik())
            System.out.println(k2.getNik()+","+k2.getNama()+","+sdf.format(date));
        else
            System.out.println("Data tidak ditemukan");
        }while(a==101||a==102||a==103);
        
        System.out.println("Lakukan Presensi");
        System.out.println("Lakukan presensi masuk");
        do{
        System.out.println("Masukkan nik :");
        a=in.nextInt();
        if(a==k0.getNik())
        System.out.println(k0.getNik()+","+k0.getNama()+","+sdf.format(date));
        
        else if(a==k1.getNik())
            System.out.println(k1.getNik()+","+k1.getNama()+","+sdf.format(date));
        else if (a==k2.getNik())
            System.out.println(k2.getNik()+","+k2.getNama()+","+sdf.format(date));
        else
            System.out.println("Data tidak ditemukan");
        }while(a==101||a==102||a==103);
        System.out.println("Gaji Bulan ini");
        System.out.println(k0.getNik()+","+k0.getNama()+","+k0.getGaji()+","+k0.getTunjangan()+","+k0.getBonus()+","+k0.getDenda()+","+k0.totalGaji());
        System.out.println(k1.getNik()+","+k1.getNama()+","+k1.getGaji()+","+k1.getTunjangan()+","+k1.getBonus()+","+k1.getDenda()+","+k1.totalGaji());
        System.out.println(k2.getNik()+","+k2.getNama()+","+k2.getGaji()+","+k2.getTunjangan()+","+k2.getBonus()+","+k2.getDenda()+","+k2.totalGaji());
    } 
}
