package This;
public class mainPayRoll {
    public static void main(String[] agrs0) {
        
        
        payroll Header = new payroll();
        Header.header();
        System.out.println();
                
        payroll A = new payroll();
        A.setNIK("101");
        A.setNama("Paijo");
        A.setGaji(900);
        A.setTunjangan(200);
        A.setBonus(150);
        A.setDenda(75);
        A.TanggalPegawai[0] = "2016-01-15";
        A.JamMasuk[0] = (8);
        A.JamKeluar[0] = (17);
        A.Denda1(A.JamMasuk[0], A.JamKeluar[0], A.getDenda());
        A.Bonus1(A.JamKeluar[0], A.getBonus());
        A.TotalGaji();
        A.DisplayX();
        A.TanggalPegawai[1] = "2016-01-16";
        A.JamMasuk[1] = (8);
        A.JamKeluar[1] = (18.5);
        A.Denda2(A.JamMasuk[1], A.JamKeluar[1], A.getDenda());
        A.Bonus2(A.JamKeluar[1], A.getBonus());
        A.TotalGaji();
        A.GajiKeseluruhan();
        A.DisplayY();
        A.DisplayMessage();
        System.out.println("===============================================================");
        System.out.println();
        
        payroll B = new payroll();
        B.setNIK("102");
        B.setNama("Lulu");
        B.setGaji(875);
        B.setTunjangan(200);
        B.setBonus(100);
        B.setDenda(100);
        B.TanggalPegawai[0] = "2016-01-15";
        B.JamMasuk[0] = (8);
        B.JamKeluar[0] = (15);
        B.Denda1(B.JamMasuk[0], B.JamKeluar[0], B.getDenda());
        B.Bonus1(B.JamKeluar[0], B.getBonus());
        B.TotalGaji();
        B.DisplayX();
        B.TanggalPegawai[1] = null;
        B.TotalGaji();
        B.GajiKeseluruhan();
        B.DisplayY();
        B.DisplayMessage();
        System.out.println("===============================================================");
        System.out.println();
        
        payroll C = new payroll();
        C.setNIK("103");
        C.setNama("lala");
        C.setGaji(1000);
        C.setTunjangan(350);
        C.setBonus(200);
        C.setDenda(125);
        C.TanggalPegawai[0] = "2016-01-15";
        C.JamMasuk[0] = (8);
        C.JamKeluar[0] = (17);
        C.Denda1(C.JamMasuk[0], C.JamKeluar[0], C.getDenda());
        C.Bonus1(C.JamKeluar[0], C.getBonus());
        C.TotalGaji();
        C.DisplayX();
        C.TanggalPegawai[1] = null;
        C.TotalGaji();
        C.GajiKeseluruhan();
        C.DisplayY();
        C.DisplayMessage();
        System.out.println("===============================================================");
        System.out.println();

    }
}

