
public class PayrollMain {
    
    public static void main(String[] args) {
        //masuk kerja jam 08:00 ,selesai jam 17:00
        Payroll pr=new Payroll();
        double jamKerjaP=(19),jamKerjaLu=7;
        double jamKerjaLa=9,gajiTotP,gajiTotLu,gajiTotla;
        int []gaji={900,875,1000};
        int []tun={200,200,350};
        int []bonus={150,100,200};
        int []denda={75,100,125};
        {
        if(jamKerjaP == 9){
            gajiTotP=gaji[0]+tun[0];
            pr.setgajiP(gajiTotP);
        }
        else if (jamKerjaP>9){
            gajiTotP=(gaji[0]+tun[0]+(bonus[0]*(jamKerjaP-9)));
            pr.setgajiP(gajiTotP);
        }
        else{
            gajiTotP=gaji[0]+tun[0]-(denda[0]*(9-jamKerjaP));
            pr.setgajiP(gajiTotP);
       }
        }
        {    
        }
        {
        if(jamKerjaLa == 9){
            gajiTotla=gaji[2]+tun[2];
            pr.setgajiLa(gajiTotla);
        }
        else if (jamKerjaLa>9){
            gajiTotla=(gaji[2]+tun[2]+(bonus[2]*(jamKerjaLa-9)));
            pr.setgajiLa(gajiTotla);
        }
        else{
            gajiTotla=gaji[2]+tun[2]-(denda[2]*(9-jamKerjaLa));
            pr.setgajiLa(gajiTotla);
       }
        }
        {
        if(jamKerjaLu == 9){
            gajiTotLu=gaji[1]+tun[1];
            pr.setgajiLu(gajiTotLu);
        }
        else if (jamKerjaLu>9){
            gajiTotLu=(gaji[1]+tun[1]+(bonus[1]*(jamKerjaLa-9)));
            pr.setgajiLu(gajiTotLu);
        }
        else{
            gajiTotLu=gaji[1]+tun[1]-(denda[1]*(9-jamKerjaLu));
            pr.setgajiLu(gajiTotLu);
       }
        }
   
       pr.display();
        System.out.println("Total gaji masing2 :");
       pr.display2();
    }
}
