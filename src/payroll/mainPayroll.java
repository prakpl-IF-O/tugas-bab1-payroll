/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 *
 * @author Faza Abdi
 */
public class mainPayroll {

    public static void main(String[] args) throws Exception {
        DateFormat formatter1;
        formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        Format formatter = new SimpleDateFormat("EEE");
        String today = formatter.format(formatter1.parse("2016-01-16"));
    }
}
