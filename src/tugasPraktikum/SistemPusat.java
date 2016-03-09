package tugasPraktikum;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SistemPusat {
    public static void main(String[] args) {
        
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
        
        
    }
}
