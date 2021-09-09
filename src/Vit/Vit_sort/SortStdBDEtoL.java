/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.sort;

import Vit.model.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SortStdBDEtoL implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String sdate1 = o1.getBirthDate();
        String sdate2 = o2.getBirthDate();

        try {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate2);
            return date1.compareTo(date2);
        } catch (ParseException ex) {
            Logger.getLogger(SortStdBDEtoL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
