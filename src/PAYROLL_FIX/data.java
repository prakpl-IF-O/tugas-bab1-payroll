package PAYROLL_FIX;
import java.util.Scanner;
public class data {
    int nik1=101; int nik2=102; int nik3=103;
    String nam1="Paijo"; String nam2="Lulu"; String nam3="Lala";
    double gaji1=500, gaji2=875, gaji3=1000;
    double tun1=500, tun2=200, tun3=350;
    double bon1=100, bon2=100, bon3=200;
    double den1=100, den2=100, den3=125;
    double bonus, denda;
    int hk, lemburlibur;
    double telat, telatt=0, lembur, lemburr=0;
    
    
    public void data(){
        System.out.println("======================================================");
        System.out.println("nik     nama      gaji     tunjangan    bonus    denda");
        System.out.println("------------------------------------------------------");
        System.out.println("101     paijo     900        200        150       75");
        System.out.println("102     lulu      875        200        100       100");
        System.out.println("103     lala      1000       350        200       125");
        System.out.println("======================================================");
        System.out.println("MASUK = 08.00 || PULANG = 17.00");
    }
    
    public void harilibur(){
        
    }
}
