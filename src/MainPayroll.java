
public class MainPayroll {

    public static void main(String[] args) {

        Karyawan k1 = new Karyawan();
        k1.setNIK("151");
        k1.setNama("Satria");
        k1.setGaji(900);
        k1.setTunjangan(200);
        

        k1.setTanggalK(2016, 2, 9, 10, 0, 19, 00);
        k1.setTanggal(2016, 2, 9, 8, 0, 17, 00);
        k1.setDenda(75);
        k1.setBonus(150);
        k1.setTotalgaji();
        k1.displayMessage();

    }

}
