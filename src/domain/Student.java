/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Cristopher.za
 */
public class Student {
    private int id; private static int carrerID;
    private String  phoneNumber, email, address, studentID, lastName, firstName;
    private Date birthday;

    public Student(int id, int carrerID, String phoneNumber, String email, String address, String studentID, String lastName, String firstName, Date birthday) {
        this.id = id;
        this.carrerID = carrerID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarrerID() {
        return carrerID;
    }

    public void setCarrerID(int carrerID) {
        this.carrerID = carrerID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}

