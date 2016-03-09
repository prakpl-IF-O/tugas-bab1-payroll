public class data {
    int tg,gaji,bon,tun,den;
    String nik, nama;
    public void setGaji(int gaji,int bon,int tun) {
        this.gaji = gaji;
        this.bon = bon;
        this.tun = tun;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void setNaNik(String nik,String nama) {
        this.nik = nik;
        this.nama = nama;
    }
    
    public void totalgaji(){
        tg=gaji+tun+bon-den;
    }
    public void show(){
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
        System.out.println(nik+","+nama+","+gaji+","+tun+","+bon+","+den);
    }
    public void showtg(){
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
        System.out.println(nik+","+nama+","+gaji+","+tun+","+bon+","+den+","+tg);
    }
}
