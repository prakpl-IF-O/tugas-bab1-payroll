import java.util.ArrayList;
import java.util.Date;
public class Tugas1 {
    public int nik;
    public String nama;
    public double gaji,tunjangan,bonus,denda,jumlah;
    
    public static void main(String[]args){
        Tugas1 karyawan_1 = new Tugas1();
        Tugas1 karyawan_2 = new Tugas1();
        Tugas1 karyawan_3 = new Tugas1();
        
            }
    public void setNik (int s){
        nik = s;
    }
    public void setNama(String s){
        nama = s;
    }
    
    
            
    public void InformasiKaryawan(){
        System.out.printf("%-10s : %d\n","NIK",nik);
        System.out.printf("%-10s : %s\n","Nama",nama);
        System.out.printf("%-10s : Rp. %f\n","Gaji",gaji);
        System.out.printf("%-10s : Rp. %s\n","Nama",tunjangan);
        System.out.printf("%-10s : Rp. %s\n","Nama",bonus);
        System.out.printf("%-10s : Rp.-%s\n","Nama",denda);
        System.out.println("-------------------------- +");
        System.out.printf("%-10s : Rp. %s","Jumlah",jumlah);
        
        
        
}
}