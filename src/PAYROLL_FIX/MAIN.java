package PAYROLL_FIX;
import java.util.Scanner;
public class MAIN {
    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
        data d=new data();
        data k1=new data();
        data k2=new data();
        data k3=new data();
        System.out.println("APLIKASI PAYROLL");
        System.out.println("");
        d.data();
        int menu=0;
        do{
        System.out.println("Pilih Karyawan ");
        System.out.println("101. Paijo");
        System.out.println("102. Lulu");
        System.out.println("103. Lala");
        System.out.println("0. KELUAR");
        System.out.print("Masukan NIK Pegawai : ");
        menu=masukan.nextInt();
        switch(menu){
            case 101:
                System.out.println("Nama Karyawan : "+k1.nam1);
                k1.harikerja();
                System.out.println("");
                k1.harilibur();
                k1.bonusdenda(k1.bon1, k1.den1);
                k1.gaji(k1.gaji1, k1.bonus, k1.tun1, k1.denda); break;
                
            case 102:
                System.out.println("Nama Karyawan : "+k2.nam2);
                k2.harikerja();
                System.out.println("");
                k2.harilibur();
                k2.bonusdenda(k2.bon2, k2.den2);
                k2.gaji(k2.gaji2, k2.bonus, k2.tun2, k2.denda); break;
                
            case 103:
                System.out.println("Nama Karyawan : "+k3.nam3);
                k3.harikerja();
                System.out.println("");
                k3.harilibur();
                k3.bonusdenda(k3.bon3, k3.den3);
                k3.gaji(k3.gaji3, k3.bonus, k3.tun3, k3.denda); break;
                
            case 0:
                break;
                
            default:
                System.out.println("NIK TIDAK DITEMUKAN"); 
 
            }
        }while(menu!=0);
        System.out.println("Anda Keluar dari Aplikasi");
    }
}
