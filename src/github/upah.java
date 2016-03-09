package github;
public class upah {
private double denda1,denda2;
private double bonus;
private double z;
    public void Upah(int a,int b, int c, int d, int e, double x, double y){
           if (a==1||a==7) {
            z=(y-x)*d;
               
        }
           else{if (y<17.00) {
               denda1=17.00-y*e;    
               }
               if (x>08.00) {
                denda2=x-08.00*e;   
               }
               if (y>17.00) {
                bonus=y-17.00*d;
               }
           }
}    
}
