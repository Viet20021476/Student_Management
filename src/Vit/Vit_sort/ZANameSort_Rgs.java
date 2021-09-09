/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.sort;

import Vit.model.Register;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class ZANameSort_Rgs implements Comparator<Register>{
    @Override
    public int compare(Register o1, Register o2) {
        String[] s1 = o1.getStudent().getFullName().split("\\s+");
        String[] s2 = o2.getStudent().getFullName().split("\\s+");
        
        return s2[s2.length - 1].compareTo(s1[s1.length - 1]);
    } 
}
