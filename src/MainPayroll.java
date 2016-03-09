import java.util.Date;
public class MainPayroll {

    public static void main(String[] args) {

        Date tanggal = new Date();
        
        Karyawan k1 = new Karyawan();
        k1.setNIK("101");
        k1.setNama("Paijo");
        k1.setGaji(900);
        k1.setTunjangan(200);
        k1.setBonus(150);
        k1.setDenda(75);
        k1.setTotalgaji();
        k1.displayMessage();
        
        System.out.println(tanggal);        
        
        
    }

}
