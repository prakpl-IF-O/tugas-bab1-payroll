public class Gaji {
    private double TotalGaji;
    private double Denda;
    private double Dendax;
    private double Bonus;
    public void Gaji(int hari, double jamker, double jampul, int bonus, int denda, int gaji, int tunjangan) {
        if (hari == 1 || hari == 7) {
            double a = (jampul - jamker) / 0.30;
            if (a % 2 == 0) {
                TotalGaji = (jampul - jamker) * bonus;
            } else {
                TotalGaji = (jampul - jamker + 0.2) * bonus; }
        }else {
            if (jamker>08.00) {
                Denda=(08.00-jamker)*denda;   }
            if (jampul<17.00) {
                Dendax=(17.00-jampul)*denda;}
            if (jampul>17.00) {
                Bonus=(jampul-17.00)*bonus;   }
        TotalGaji = ( gaji+tunjangan+Bonus )-(Denda+Dendax); }}
    public double getTotalGaji() {
     return TotalGaji;}}
