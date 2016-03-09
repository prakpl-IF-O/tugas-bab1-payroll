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
    }
}
