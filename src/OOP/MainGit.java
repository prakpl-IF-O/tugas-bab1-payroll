package OOP;

public class MainGit {
    public static void main(String[] args) {
        //deklarasi array data karyawan bertipe String
        String [][] datakaryawan ={
            {"101", "paijo", "900", "200", "150", "75"},
            {"102", "lulu", "875", "200", "100", "100"},
            {"103", "lala", "1000", "350", "200", "125"},
    };
        System.out.println("\tDATA KARYAWAN");
        //mendeklarasikan baris dan kolom
        int i,j;
        for (i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 6 ; j++){
                System.out.print(datakaryawan[i][j] + " ,");
            }
            System.out.println(" ");
        }
        String [][] dataabsensi ={
            {"101", "2016-01-15", "08:00", "17:00"},
            {"101", "2016-01-16", "08:00", "18:30"},
            {"102", "2016-01-15", "08:00", "15:00"},
            {"103", "2016-01-15", "08:00", "17:00"},
    };
        System.out.println("\tDATA ABSENSI");
        //mendeklarasikan baris dan kolom
        int x,y;
        for (x = 0 ; x < 4 ; x++){
            for (y = 0 ; y < 4 ; y++){
                System.out.print(dataabsensi[x][y] + " ,");
            }
            System.out.println("");
        }
        
    }
}

