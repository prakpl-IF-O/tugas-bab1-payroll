/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Kenank
 */
public class PerhitunganGaji {
    private String nama;
    private int nik;
    private double gaji;
    private double totalgaji;
    private double denda;
    private double dendap;
    private double dendak;
    private double bonus;
    public void hitung(int hari,double masuk,double keluar, double bonus, double tunjangan,double denda, double gaji){
        if (hari==1||hari==7){
            double q = (masuk-keluar)/ 0.30;
            if (q%2==0){
                totalgaji= (keluar-masuk)*bonus;
            }else {
                totalgaji = (keluar-masuk+0.20)*bonus;
            }
        }
        else {
            if (masuk>08.00){
                dendap=(08.00-masuk)*denda;
            }
            if (keluar<17.00){
                dendak=(17.00-keluar)*denda;
            }
            if (keluar>17.00){
                bonus=(int)((keluar-17.00)*bonus);
            }
            totalgaji=(gaji+tunjangan+bonus)-denda;
        }
    
    
}
public double Getgajitotal(){
    return totalgaji;
}


}