/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dino Keylas
 */
public class HitungGaji {
    private double TotalGaji;
    private double Denda1, Denda2;
    private double Bonus;
    
    public void hitungGaji(int hari, double jamker, double jampul,int bonus,int denda,int gaji, int tunjangan){
        if (hari==1||hari==7) {
            double a=(jampul-jamker)/30;
            if (a%2==0) {
                TotalGaji=(jampul-jamker)*bonus;
            }
            else {
            TotalGaji=(jampul-jamker)*bonus;
            }
        }
        else {
            if (jamker>08.00) {
                Denda1=(jamker-08.00)*denda;
            }
            if (jampul<17.00) {
                Denda2=(17.00-jampul)*denda;
            }
            if (jampul>17.00) {
                Bonus=(jampul-17.00)*bonus;
            }
            TotalGaji=(gaji+tunjangan+Bonus)-(Denda1+Denda2);
        }
    }

    public double getTotalGaji() {
        return TotalGaji;
    }
}
