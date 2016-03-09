import java.util.Calendar;
public class git {
public String nik,nama;
public int gaji,tunjangan,bonus,tahun,bulan,denda,totalgaji;
public int jammu,memu,jase,mise,day,jt,jp,wl;
boolean hari = false;
Calendar tanggal1 = Calendar.getInstance();
Calendar tanggal2 = Calendar.getInstance();
public void setgaji(int gaji, int tunjangan, int bonus){
totalgaji= (gaji + tunjangan + bonus) - denda;
}

public void setnama(String a){
nama = a;
}

public void calendar (int t, int b, int h,int jammu, int memu ,int jase,int mise){
tanggal1.set(t,b,h,jammu,memu,0);
tanggal2.set(t,b,h,jase,mise,0);
}
public void setdenda(){
if (jt>8){
    jt=(jt-8)*denda;    
}
if (jp<17){
    jp=(17-jp)*denda;
}
}

public void setbonus(){
if(bonus>17){
    bonus=bonus*(wl-17);
}
}
public void setnik(String a){
nik = a;
}

public void settunjangan(int a){
tunjangan = a;
}
public void sethari(int a){
if (a==2||a==3) {hari=true;}
else if ((a-2)%7==0){
    hari=true;
}else if((a-3)%7==0){
    hari=true;
}
}
public void displaymessage(){
    System.out.println(nik+"," + nama + "," + gaji + "," + tunjangan + "," + bonus + "," + denda);
}

public void displaytotal(){
    System.out.println(nik + "," + nama + "," + gaji + "," + tunjangan + "," + bonus + "," + denda);
}

}
