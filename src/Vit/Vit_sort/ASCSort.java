/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.sort;

import Vit.model.Subject;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class ASCSort implements Comparator<Subject>{

    @Override
    public int compare(Subject o1, Subject o2) {
        return Integer.compare(o1.getNumOfLessons(), o2.getNumOfLessons());
    }
    
}
