public class mainPR {
    public static void main(String[] args) {
        data p1=new data();
        data p2=new data();
        data p3=new data();
        p1.setNaNik("101", "Paijo");
        p1.calendar(2016, 0, 15,8 , 0, 17, 00);
        p1.setGaji(900, 200, 150);
        p1.setDen(75);        
        p1.totalgaji();                      
        p2.setNaNik("102", "Lulu");
        p2.calendar(2016, 0, 15,8 , 0, 18, 30);
        p2.setGaji(875, 200, 100);
        p2.setDen(100);        
        p2.totalgaji();
       p3.setNaNik("103", "Lala");
        p3.calendar(2016, 0, 15,8 , 0, 17, 00);
        p3.setGaji(1000, 350, 200);
        p3.setDen(125);        
        p3.totalgaji();    
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
        p1.show();
        p2.show();
        p3.show();
        System.out.println("");
        p1.setcal();
        p2.setcal();
        p3.setcal();
        System.out.println("");
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
        p1.showtg();
        p2.showtg();
        p3.showtg();
        
    }
    
}
