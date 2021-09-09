/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.model;

/**
 *
 * @author Admin
 */
public class Person {

    private String ps_id;
    private String fullName;
    private String birthDate;
    private String address;
    private String email;
    private String phoneNumber;

    public Person(String ps_id, String fullName, String birthDate, String address, String email, String phoneNumber) {
        this.ps_id = ps_id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPs_id() {
        return ps_id;
    }

    public void setPs_id(String ps_id) {
        this.ps_id = ps_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
