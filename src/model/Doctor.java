package model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PCDELL
 */
public class Doctor implements Comparable<Doctor>{

    private int id;
    private String name;
    private Date dateOfBirth;
    private String Specialization;
    private String email;
    private String mobile;
    private int Available;

    public Doctor(int id, String name, Date dateOfBirth, String Specialization, String email, String mobile, int Available) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.Specialization = Specialization;
        this.email = email;
        this.mobile = mobile;
        this.Available = Available;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAvailable() {
        return Available;
    }

    public void setAvailable(int Available) {
        this.Available = Available;
    }

    public void input() {
        name = Validation.getString(0, 50, "Nhap ten new doctor: ");
        dateOfBirth = Validation.getDate("dd/MM/yyyy", "Ngap ngay sinh cua doctor");
        Specialization = Validation.getString(0, 255, "Nhap Specialization cua doctor");
        Available = Validation.getInt(0, 4, "Nhap available");
        email = Validation.getpatternAddress("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$", "Nhap email");
        mobile = Validation.getpatternAddress("^[0-9]{0,3}+-[0-9]{3}+-[0-9]{4}$","Nhap mobile");
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\ndateOfBirth: "
                + dateOfBirth + "\nSpecialization: " + Specialization
                + "\nEmail: " + email + "\nMobile: " + mobile + "\nAvailable" + Available; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Doctor o) {
        return this.getDateOfBirth().compareTo(o.getDateOfBirth());
    }

}
