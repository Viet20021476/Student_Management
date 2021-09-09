/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.sort;

import Vit.model.Register;
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
public class SortRgsLtoE implements Comparator<Register> {

    @Override
    public int compare(Register o1, Register o2) {
        String sdate1 = o1.getRegisterDate();
        String sdate2 = o2.getRegisterDate();

        try {
            Date date1 = new SimpleDateFormat("hh:mm:ssa dd/MM/yyyy").parse(sdate1);
            Date date2 = new SimpleDateFormat("hh:mm:ssa dd/MM/yyyy").parse(sdate2);
            return date2.compareTo(date1);
        } catch (ParseException ex) {
            Logger.getLogger(SortStdBDEtoL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
