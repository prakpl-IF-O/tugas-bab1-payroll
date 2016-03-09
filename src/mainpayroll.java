package pkgclass.object;

public class mainpayroll {
    public static void main(String[] args) {

        karyawan k1 = new karyawan(101,"Paijo", 900, 200, 150, 75);
        karyawan k2 = new karyawan(102,"Lulu", 875, 200, 100, 100);
        karyawan k3 = new karyawan(103,"Lala", 1000, 350, 200, 120);
        
        k1.tampilkan();
        k2.tampilkan();
        k3.tampilkan();
        System.out.println("NIK \t Nama \t Gaji \t Tunjangan \t Bonus \t Denda \t Total Gaji");
        k1.tabel();
        k2.tabel();
        k3.tabel();
    }
    
}
