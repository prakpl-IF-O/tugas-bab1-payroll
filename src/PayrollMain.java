
public class PayrollMain {
    
    public static void main(String[] args) {
        // tanggal 15=jumat ,16=sabtu
        //masuk kerja jam 08:00 ,selesai jam 17:00
        Payroll pr=new Payroll();
        double jamKerjaP=(8+9.5),jamKerjaLu=6;
        double jamKerjaLa=8,gajiTotP,gajiTotLu,gajiTotla;
        int []gaji={900,875,1000};
        int []tun={200,200,350};
        int []bonus={150,100,200};
        int []denda={75,100,125};
        {
        if(jamKerjaP == 8){
            gajiTotP=gaji[0];
        }
        else if (jamKerjaP>8){
            gajiTotP=(gaji[0]+tun[0]+(bonus[0]*(jamKerjaP-8)));
        }
        else{
            gajiTotP=gaji[0]-(denda[0]*(8-jamKerjaP));
       }
        }
        {    
        }
        {
        if(jamKerjaLa == 8){
            gajiTotla=gaji[1];
        }
        else if (jamKerjaLa>8){
            gajiTotla=(gaji[1]+tun[1]+(bonus[1]*(jamKerjaLa-8)));
        }
        else{
            gajiTotla=gaji[1]-(denda[1]*(8-jamKerjaLa));
       }
        }
        {
        if(jamKerjaLu == 8){
            gajiTotLu=gaji[2];
        }
        else if (jamKerjaLu>8){
            gajiTotLu=(gaji[2]+tun[2]+(bonus[2]*(jamKerjaLa-8)));
        }
        else{
            gajiTotLu=gaji[2]-(denda[2]*(8-jamKerjaLu));
       }
        }
   
        
    }
}
