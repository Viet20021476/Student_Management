/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.model;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private String std_id;
    private String std_class;
    private String major;
    private String academic_year;

    public Student(String ps_id, String fullName, String birthDate,
            String address, String email,
            String phoneNumber, String std_id, String std_class, String major, String academic_year) {
        super(ps_id, fullName, birthDate, address, email, phoneNumber);
        this.std_id = std_id;
        this.std_class = std_class;
        this.major = major;
        this.academic_year = academic_year;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStd_class() {
        return std_class;
    }

    public void setStd_class(String std_class) {
        this.std_class = std_class;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.std_id);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.std_id, other.std_id)) {
            return false;
        }
        return true;
    }
    
    
}
