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
  
  hari a=new hari ();
     hari q1=new hari();
     hari q2=new hari();
     hari q3=new hari();
     hari q4=new hari();
    
     upah z1=new upah();
   z1.Upah(q1.Hari("2016-01-15"), 900, 200, 150, 75, 08.00, 17.00);
     upah z2=new upah();
   z2.Upah(q2.Hari("2016-01-16"), 900, 200, 150, 75, 08.00, 18.30);
     upah z3=new upah(); 
   z3.Upah(q3.Hari("2016-01-15"), 875, 200, 100, 100, 08.00, 15.00);
     upah z4=new upah(); 
   z4.Upah(q4.Hari("2016-01-15"), 1000, 350, 200, 125, 08.00, 17.00);
   x1.display();
        System.out.println(z2.getZ()+z1.getZ());
        x2.display();
        System.out.println(z3.getZ());
        x3.display();
        System.out.println(z4.getZ());
    
    }
   
    
}
