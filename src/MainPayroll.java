public class MainPayroll {

    public static void main(String[] args) {

        Karyawan k1 = new Karyawan();
        k1.setNIK("151");
        k1.setNama("Satria");
        k1.setGaji(900);
        k1.setTunjangan(200);
        k1.setBonus(150);
        k1.setDenda(75);
        k1.setTotalgaji();
        k1.setTanggalMasuk();
        k1.setTanggal1(2016, 2, 9, 14, 00);
    
        k1.displayMessage();
        

       
        
        
    }

}
