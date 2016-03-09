package pkgclass.object;

public class mainpayroll {
    public static void main(String[] args) {
        
//        karyawan k = new karyawan();
//
//        System.out.println("Nama\t\t\t: "+k.getNama());
//        System.out.print("Masuk kerja pada\t: "+k.gettanggal()+"-"+k.bulan()
//        +"-"+k.tahun());
//        System.out.println(" pada pukul  "+k.jammasuk()+" sampai dengan "+k.jampulang1());
//        System.out.print("Masuk kerja pada\t: "+k.gettanggal2()+"-"+k.bulan()
//        +"-"+k.tahun());
//        System.out.println(" pada pukul "+k.jammasuk()+" sampai dengan "+k.jampulang2());
//        System.out.println("Gaji\t\t\t: "+k.gaji1());
//        System.out.println("Tunjangan\t\t: "+k.tun1());
//        System.out.println("Bonus\t\t\t: "+k.bonus1());
//        System.out.println("Denda\t\t\t: "+k.denda1());
//        System.out.println("Total Gaji\t\t: "+k.totalgaji1());
//        System.out.println("");
//        
//        
//        System.out.println("Nama\t\t\t: "+k.getNama2());
//        System.out.print("Masuk kerja pada\t: "+k.gettanggal()+"-"+k.bulan()
//        +"-"+k.tahun());
//        System.out.println(" pada pukul "+k.jammasuk()+" sampai dengan "+k.jampulang3());
//        System.out.println("Gaji\t\t\t: "+ k.gaji2());
//        System.out.println("Tunjangan\t\t: "+k.tun1());
//        System.out.println("Bonus\t\t\t: "+k.bonus2());
//        System.out.println("Denda\t\t\t: "+k.denda2());
//        System.out.println("Total Gaji\t\t: "+k.totalgaji2());
//        System.out.println("");
//        
//        
//        System.out.println("Nama\t\t\t: "+k.getNama3());
//        System.out.print("Masuk kerja pada\t: "+k.gettanggal()+"-"+k.bulan()
//        +"-"+k.tahun());
//        System.out.println(" pada pukul "+k.jammasuk()+" sampai dengan "+k.jampulang1());
//        System.out.println("Gaji\t\t\t: "+k.gaji3());
//        System.out.println("Tunjangan\t\t: "+k.tun2());
//        System.out.println("Bonus\t\t\t: "+k.bonus2());
//        System.out.println("Denda\t\t\t: "+k.denda1());
//        System.out.println("Total Gaji\t\t: "+k.totalgaji3());
        
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
        
//        k1.Absensi(101, 15, 01, 2016, 8, "00", 17, "00", kalender.cek_libur(15, 1, 2016));
//        k1.Absensi(101, 16, 01, 2016, 8, "00", 18, "30", kalender.cek_libur(16, 1, 2016));
//        k2.Absensi(102, 15, 01, 2016, 8, "00", 15, "00", kalender.cek_libur(15, 1, 2016));
//        k3.Absensi(103, 16, 01, 2016, 8, "00", 17, "00", kalender.cek_libur(15, 1, 2016));
//        
    }
    
}
