/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Subject {
    private String subj_Id;
    private String subj_Name;
    private int numOfLessons;
    private String type;
    private ArrayList<Register> registers_list;

    public Subject(String subj_Id, String subj_Name, String type, int numofLss) {
        this.subj_Id = subj_Id;
        this.subj_Name = subj_Name;
        this.numOfLessons = numofLss;
        this.type = type;
    }

    public String getSubj_Id() {
        return subj_Id;
    }

    public void setSubj_Id(String subj_Id) {
        this.subj_Id = subj_Id;
    }

    public String getSubj_Name() {
        return subj_Name;
    }

    public void setSubj_Name(String subj_Name) {
        this.subj_Name = subj_Name;
    }

    public int getNumOfLessons() {
        return numOfLessons;
    }

    public void setNumOfLessons(int numOfLessons) {
        this.numOfLessons = numOfLessons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Register> getRegisters_list() {
        return registers_list;
    }

    public void setRegisters_list(ArrayList<Register> registers_list) {
        this.registers_list = registers_list;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.subj_Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.subj_Id, other.subj_Id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
