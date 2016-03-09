public class hub {
   public static void main(String[] args) {
   git g1 = new git ();
   git g2 = new git ();
   git g3 = new git ();
   g1.setnama("paijo");
   g1.setnik("102");
   g1.calendar(2016, 0,14,8,0,17,00);
   g1.setgaji(900,200,160);
   g1.setdenda(75);
   g2.setnama("lulu");
   g2.setnik("101");
   g2.calendar(2016, 0, 15,8 , 0, 18, 30);
   g2.setgaji(875, 200, 100);
   g2.setdenda(100);
   g3.setnama("lala");
   g3.setnik("103");
   g3.calendar(2016, 0, 15,8 , 0, 17, 00);
   g3.setgaji(1000, 350, 200);
   g3.setdenda(125);
   System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
   g1.displaymessage();
   g2.displaymessage();
   g3.displaymessage();
   System.out.println("");
   
   
}
 
}
