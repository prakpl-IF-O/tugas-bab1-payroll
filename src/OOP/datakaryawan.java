package OOP;

public class datakaryawan {
    public String Nama, NIK;
        public double Gaji, Tunjangan, Bonus, Denda, jam_masuk, jam_pulang, totalGaji;
        public String Tgl;
           
        public void setNIK(String a){
            NIK = a;
        }
        public void setNama(String b){
            Nama = b;
        }
        public void setGaji(int c){
            Gaji = c;
        }
        public void setTunjangan(int d){
            Tunjangan = d;
        }
        public void setBonus(int e){
            Bonus = e;
        }
        public void setDenda(int f){
            Denda = f;
        }
        public void displayKRY(){
            //deklarasi array data karyawan bertipe String
            String [][] datakaryawan ={
                {"NIK", "Nama" , "Gaji", "Tunjangan", "Bonus", "Denda"},
                {"101", "paijo", "900"    , "200"   , "150"  , "75"},
                {"102", "lulu" , "875"    , "200"   , "100"  , "100"},
                {"103", "lala" , "1000"   , "350"   , "200"  , "125"},
            };
                System.out.println("\tDATA KARYAWAN");
            //mendeklarasikan baris dan kolom
            int y,z;
            for (y = 0 ; y < 4 ; y++){
                for(z = 0 ; z < 6 ; z++){
                    System.out.print(datakaryawan[y][z] + ",");
                }
                    System.out.println(" ");
            }
        }      
        
        public void displayABS(){
            String [][] dataabsensi ={
                {"NIK"  , "Tanggal", "Jam Masuk", "Jam Pulang"},
                {"101", "2016-01-15", "08:00"    , "17:00"},
                {"101", "2016-01-16", "08:00"    , "18:30"},
                {"102", "2016-01-15", "08:00"    , "15:00"},
                {"103", "2016-01-15", "08:00"    , "17:00"},
            };
                System.out.println("\tDATA ABSENSI");
            //mendeklarasikan baris dan kolom
            int x,w;
            for (x = 0 ; x < 5 ; x++){
                for (w = 0 ; w < 4 ; w++){
                    System.out.print(dataabsensi[x][w] + ",");
                }
                System.out.println("");
            }
        }
        public void displayTot(){
            String [][] datatotal_gaji ={
                {"NIK", "Nama" , "Gaji","Tunjangan", "Bonus", "Denda", "Total Gaji"},
                {"101", "paijo", "900"  , "200"     , "150"  , "75"     , "2600"},
                {"102", "lulu" , "875"  , "200"     , "100"  , "100"    , "875"},
                {"103", "lala" , "1000" , "350"     , "200"  , "125"    , "1350"},
            };
                System.out.println("\tDATA PENGOLAHAN TOTAL GAJI");
            //mendeklarasikan baris dan kolom
            int s,t;
            for (s = 0 ; s < 4 ; s++){
                for (t = 0 ; t < 7 ; t++){
                    System.out.print(datatotal_gaji[s][t] + ",");
                }
                System.out.println("");
            }
        }
}
