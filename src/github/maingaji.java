package github;
public class maingaji {
    public static void main(String[] args) {
    karyawan x1=new karyawan();
  x1.karyawan("Paijo", "101", 900, 200, 150, 75);
    karyawan x2=new karyawan();
  x2.karyawan("Lulu", "102", 875, 200, 100, 100);
    karyawan x3=new karyawan();
  x3.karyawan("Lala", "103", 1000, 350, 200, 125);  
    absensi y1=new absensi();
  y1.absensi("101", "2016-01-15", 08.00, 17.00);
    absensi y2=new absensi();
  y2.absensi("101", "2016-01-16", 08.00, 18.30);
    absensi y3=new absensi();
  y3.absensi("102", "2016-01-15", 08.00, 15.00);
    absensi y4=new absensi();  
  y4.absensi("103", "2016-01-15", 08.00, 17.00);
    }
    
}
