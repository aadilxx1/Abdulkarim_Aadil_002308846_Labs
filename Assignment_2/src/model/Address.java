/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aadilkarim
 */
public class Address {
    
    private String street;
    private String unit;
    private String city;
    private String state;
    private String zip;
    private String phone;

    // Constructor with six fields for address
    public Address(String street, String unit, String city, String state, String zip, String phone) {
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    // Getters and setters for each field
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return street + " Unit: " + unit + ", " + city + ", " + state + " " + zip + "\nPhone: " + phone;
    }
}


