
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Absensi {

    int nik;
    String tgl;
    int jm;
    int mm;
    int jp;
    int mp;
    double checkJam = 0;
    boolean isLibur;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Absensi(int n, String t, int a, int b, int c, int d) {
        nik = n;
        tgl = t;
        jm = ((a >= 0 && a < 24) ? a : 0);
        mm = ((b >= 0 && b < 60) ? b : 0);
        jp = ((c >= 0 && c < 24) ? c : 0);
        mp = ((d >= 0 && d < 60) ? d : 0);
    }

    public void checkLibur() throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(tgl));
        int cek = c.get(Calendar.DAY_OF_WEEK);
        if (cek == 1 || cek == 7) {
            isLibur = true;
        } else {
            isLibur = false;
        }

    }

    public void checkJam() {
        int j = 0;
        double m = 0;
        if (isLibur = true) {
            m = mp - mm;
            if (m < 0) {
                m = 60 + m;
                j = -1;
            }
            checkJam = j + (jp - jm);
        } else {
            if (jm >= 8) {
                j = 8 - jm;
                m = mm / -60.0;
            } else {
                if (mm > 0) {
                    j = 8 - (jm + 1);
                    m = mm / 60.0;
                } else {
                    j = 8 - jm;
                }

            }
            checkJam = j + m;
            if (jp >= 17) {
                j = jp - 17;
                m = mm / 60.0;
            } else {
                if (mm > 0) {
                    j = jp - (17 - 1);
                    m = mm / -60.0;
                } else {
                    j = jp - 17;
                }
            }
            checkJam = checkJam + j + m;
        }

    }
}
