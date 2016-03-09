
public class Payroll {
 
 double gajiP,gajiLu,gajiLa;
 int []nik = {101,102,103};
 String [] nama ={"paijo","lulu","lala"};
 
 
 public void setgajiP(double n){
     gajiP=n;
 }
 public void setgajiLa(double lu){
     gajiLu=lu;
 }
 public void setgajiLu(double la){
     gajiLa=la;
 }
 public void display(){
     for(int i=0;i<3;i++){
     System.out.println("Nama : "+nama[i]+" "+"nik : " +nik[i] );   
     }
 }
 public void display2(){
     System.out.println(gajiP);
     System.out.println(gajiLa);
     System.out.println(gajiLu);
 }
         
}
