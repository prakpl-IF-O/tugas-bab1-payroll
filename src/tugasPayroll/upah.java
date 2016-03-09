package tugasPayroll;
public class upah {
    private double totalGaji,denda1,denda2,Bonus;
    public void hitung(double jamAwal, double jamAkhir, int gaji, int tunjangan, int bonus, int denda, int hari){
        if(hari==1||hari==7){
            this.totalGaji=totalGaji;
            totalGaji = ((int)jamAkhir-jamAwal)*bonus;   
        }
        else
        {
         if(jamAwal>08.00){
             this.denda1=denda1;
             denda1=denda*(jamAwal-08.00);
         }
         if(jamAkhir<17.00){
             this.denda2=denda2;
             denda2=denda*(17.00-jamAkhir);
         }
         if(jamAkhir>17.00){
             this.Bonus=Bonus;
             Bonus = bonus*(jamAkhir-17.00);
         }
         this.totalGaji=totalGaji;
         totalGaji = gaji+tunjangan+Bonus-denda1-denda2;
        }
    }

    public double getTotalGaji() {
        return totalGaji;
    }
    
}
