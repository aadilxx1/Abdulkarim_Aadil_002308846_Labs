/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aadilkarim
 */
public class Person {
    
    private String fname;
    private String lname;
    private String ssn;
    private int age;
    private Address homeAddress;
    private Address workAddress;
    
    public Person(String firstName, String lastName, Address homeAddress, Address workAddress, int age, String ssn) {
        this.fname = firstName;
        this.lname = lastName;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    
    
    @Override
    public String toString() {
        return "Name: " + fname + " " + lname + "\n" +
               "Age: " + age + "\n" +
               "SSN: " + ssn + "\n" +
               "Home Address:\n" + homeAddress + "\n" +
               "Work Address:\n" + workAddress;
    }
}
