import static java.lang.Integer.parseInt;
import java.util.Date;
import java.util.Scanner;
public class mainPayroll {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String [][]karyawan={
            {"101","Paijo","900","200","150","75"},
            {"102","lulu","875","200","100","100"},
            {"103","lala","1000","350","200","125"}
        };
        String [][]absensi={
            {"101","2016-01-15","08:00","17:00"},
            {"101","2016-01-16","08:00","18:30"},
            {"102","2016-01-15","08:00","15:00"},
            {"103","2016-01-15","08:00","17:00"}
        };
        payroll Krywn = new payroll();
        System.out.printf("%s %7s %10s %13s %8s %10s %14s\n","Nik","Nama","Gaji","tunjangan","bonus","denda","total gaji");
        for (int i=0;i<3;i++){
            Krywn.setNik(karyawan[i][0]);
            Krywn.setNama(karyawan[i][1]);
            Krywn.setGaji(parseInt(karyawan[i][2]));
            Krywn.setTunjangan(parseInt(karyawan[i][3]));
            Krywn.setBonus(parseInt(karyawan[i][4]));
            Krywn.setDenda(parseInt(karyawan[i][5]));
            if(i==1){
                Krywn.setjmlDenda(2);
            }else{
                Krywn.setjmlDenda(0);
            }
            if(i==0){
                Krywn.setjmlBonus(10);
            }else{
                Krywn.setjmlBonus(0);
            }
            Krywn.TotalGaji();
            Krywn.DisplayMessage();
            System.out.println();

        }     
        
        
    }
}
