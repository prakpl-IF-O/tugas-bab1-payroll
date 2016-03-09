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

    public void Absensi() {
        System.out.println("nik,tanggal,jam_masuk,jam_pulang");
        System.out.println("101," + "07-03-2016," + "0" + jampaijo + ":00" + "," + jamkpaijo2 + ":00");
        System.out.println("101," + "08-03-2016," + "0" + jampaijo + ":00" + "," + jamkpaijo2 + ":00");
        System.out.println("102," + "17-02-2016," + "0" + jamlulu + ":00" + "," + jamklulu + ":00");
        System.out.println("103," + "23-02-2016," + "0" + jamlala + ":00" + "," + jamklala + ":00");
    }

    public void Perhitungan() {
        if (jamklala > 17) {
            b_paijo = (jamkpaijo - 17);

        } else if (jamkpaijo > 17) {
            b_lulu = (jamklulu - 17);

        } else if (jamklulu > 17) {
            b_lala = (jamklala - 17);

        } else if (jamklulu < 17) {
            d_lulu = (17 - jamklulu);

        } else if (jamklala < 17) {
            d_lala = (17 - jamklala);

        } else if (jamkpaijo < 17) {
            d_paijo = (17 - jamkpaijo);
        }

    }

    public void Hasil() {
        Perhitungan();
        System.out.println("nik,nama,gaji,tunjangan,bonus,denda,total_gaji");
        System.out.println("101,paijo," + g_paijo + "," + t_paijo + "," + b_paijo + "," + d_paijo + "," + ((g_paijo + t_paijo + b_paijo) - d_paijo));
        System.out.println("102,lulu," + g_lulu + "," + t_lulu + "," + b_lulu + "," + d_lulu + "," + ((g_lulu + t_lulu + b_lulu) - d_lulu));
        System.out.println("103,lala," + g_lala + "," + t_lala + "," + b_lala + "," + d_lala + "," + ((g_lala + t_lala + b_lala) - d_lala));

    }
}
