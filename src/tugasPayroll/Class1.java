package tugasPayroll;
public class Class1 {
    public static void main(String[] args) {
        karyawan x1 = new karyawan();
        x1.data("101", "paijo", 900, 200, 150, 75);
        karyawan x2 = new karyawan();
        x2.data("102", "lulu", 875, 200, 100, 100);
        karyawan x3 = new karyawan();
        x3.data("103", "lala", 1000, 350, 200, 125);
        
        absensi y1 = new absensi();
        absensi y2 = new absensi();
        absensi y4 = new absensi();
        absensi y3 = new absensi();
        y1.absensi("101", "2016-01-15", 08.00, 17.00);
        y2.absensi("101", "2016-01-16", 08.00, 18.30);
        y3.absensi("102", "2016-01-15", 08.00, 15.00);
        y4.absensi("103", "2016-01-15", 08.00, 18.30);
        
        hari hari1 = new hari();
        hari hari2 = new hari();
        hari hari3 = new hari();
        hari hari4 = new hari();

        upah z1 = new upah();
        upah z2 = new upah();
        upah z3 = new upah();
        upah z4 = new upah();
        z1.hitung(08.00, 17.00, 900, 200, 150, 75, hari1.hari("2016-01-15"));
        z2.hitung(08.00, 18.30, 900, 200, 150, 75, hari2.hari("2016-01-16"));
        z3.hitung(08.00, 15.00, 875, 200, 100, 100, hari3.hari("2016-01-15"));
        z4.hitung(08.00, 17.00, 1000, 350, 200, 125, hari4.hari("2016-01-15"));
        
        x1.display();
        System.out.println(z1.getTotalGaji()+z2.getTotalGaji());
        x2.display();
        System.out.println(z3.getTotalGaji());
        x3.display();
        System.out.println(z4.getTotalGaji());
    }
    
}
