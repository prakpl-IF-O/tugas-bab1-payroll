package maintugasgit;

public class TugasGit {

    int nik, gaji, tunjangan, bonus, denda;
    String nama;
    int g_paijo = 900, g_lulu = 875, g_lala = 1000;
    int t_paijo = 200, t_lulu = 200, t_lala = 350;
    int b_paijo = 150, b_lulu = 100, b_lala = 200;
    int d_paijo = 75, d_lulu = 100, d_lala = 125;
    int jampaijo = 8, jamlulu = 8, jamlala = 8, jamkpaijo = 20, jamklulu = 20, jamkpaijo2 = 17, jamklala = 17;
    int jam;

    public void DataKaryawan() {
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda");
        System.out.println("101,paijo," + g_paijo + "," + t_paijo + "," + b_paijo + "," + d_paijo);
        System.out.println("102,lulu," + g_lulu + "," + t_lulu + "," + b_lulu + "," + d_lulu);
        System.out.println("103,lala," + g_lala + "," + t_lala + "," + b_lala + "," + d_lala);
    }
