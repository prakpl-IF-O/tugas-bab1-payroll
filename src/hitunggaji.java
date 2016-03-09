/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luthfi
 */
public class hitunggaji {
   private double jumlah_gaji;
    private double denda1;
    private double denda2;
    private double bonus;

    public void hitunggaji(int hr, double jam_in, double jam_out, int bonus, int denda, int gaji, int tunjangan) {
    if (hr == 1 || hr == 7) {
            double a = (jam_out - jam_in) / 0.30;
            if (a % 2 == 0) {
                jumlah_gaji = (jam_out - jam_in) * bonus;
            } else {
                jumlah_gaji = (jam_out - jam_in + 0.20) * bonus;
            }
        }
        else {
            if (jam_in>08.00) {
                denda1=(08.00-jam_in)*denda;
            }
            if (jam_out<17.00) {
                denda2=(17.00-jam_out)*denda;
            }
            if (jam_out>17.00) {
                bonus=(int) ((jam_out-17.00)*bonus);   
            }
        jumlah_gaji=(gaji+tunjangan+bonus)-(denda1+denda2);
        }
    }

    public double gettotalgaji() {
        return jumlah_gaji;
    }

}

