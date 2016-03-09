
public class MainPayroll {

    public static void main(String[] args) {

        System.out.println("Nik,Nama,Gaji,Tunjangan,Bonus,Denda,Total Gaji");
        
        Karyawan k1 = new Karyawan();
        k1.setNIK("151");
        k1.setNama("Satria");
        k1.setGaji(900);
        k1.setTunjangan(200);
        k1.setTanggalK(2016, 2, 12, 10, 0, 19, 00);
        k1.setTanggal(2016, 2, 12, 8, 0, 17, 00);
        k1.setDenda(75);
        k1.setBonus(150);
        k1.setTotalgaji();
        k1.displayMessage();
        
        
        
        Karyawan k2 = new Karyawan();
        k2.setNIK("152");
        k2.setNama("Ibnu");
        k2.setGaji(800);
        k2.setTunjangan(150);
        k2.setTanggalK(2016, 2, 13, 10, 40, 17, 00);
        k2.setTanggal(2016, 2, 13, 8, 0, 17, 00);
        k2.setDenda(80);
        k2.setBonus(160);
        k2.setTotalgaji();
        k2.displayMessage();

    }

}
