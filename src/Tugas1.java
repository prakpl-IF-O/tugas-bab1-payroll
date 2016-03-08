import java.util.ArrayList;
import java.util.Date;
public class Tugas1 {
    public int [] nik = {101,102,103};
    public String [] nama = {"Paijo", "Lulu", "Lala"} ;
    public double [] gaji = {900,875,1000};
    public double [] tunjangan = {200,200,350};
    public double [] bonus = {150,100,200};
    public double [] denda = {75,100,125};
    public double jumlah;
    public static void main(String[]args){
        Tugas1 karyawan_1 = new Tugas1();
        Tugas1 karyawan_2 = new Tugas1();
        Tugas1 karyawan_3 = new Tugas1();
        
            }
    public void setmasukKerja(){
        
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