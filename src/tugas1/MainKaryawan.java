package tugas1;

public class MainKaryawan {

    public static void main(String[] agrs0) {

        DataKaryawan k1 = new DataKaryawan();
        k1.setNik("101");
        k1.setNama("paijo");
        k1.setGaji(900);
        k1.setTunjangan(200);
        k1.setBonus(150);
        k1.setDenda(75);
        k1.tanggalPegawai[0] = "2016-01-15";
        k1.jamMasuk[0] = (8);
        k1.jamKeluar[0] = (17);
        k1.dendaPegawai1(k1.jamMasuk[0], k1.jamKeluar[0], k1.getDenda());
        k1.bonusPegawai1(k1.jamKeluar[0], k1.getBonus());
        k1.tanggalPegawai[1] = "2016-01-15";
        k1.jamMasuk[1] = (8);
        k1.jamKeluar[1] = (18.5);
        k1.dendaPegawai1(k1.jamMasuk[1], k1.jamKeluar[1], k1.getDenda());
        k1.bonusPegawai1(k1.jamKeluar[1], k1.getBonus());
        k1.totalGajiK();
        
        
        DataKaryawan k2 = new DataKaryawan();
        k2.setNik("102");
        k2.setNama("lulu");
        k2.setGaji(875);
        k2.setTunjangan(200);
        k2.setBonus(100);
        k2.setDenda(100);
        k2.tanggalPegawai[0] = "2016-01-15";
        k2.jamMasuk[0] = (8);
        k2.jamKeluar[0] = (15);
        k2.dendaPegawai1(k1.jamMasuk[0], k1.jamKeluar[0], k1.getDenda());
        k2.bonusPegawai1(k1.jamKeluar[0], k1.getBonus());
        k2.tanggalPegawai[1] = null;
        k2.totalGajiK();
        
        
    }
}
