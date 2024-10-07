/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aadilkarim
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    // Constructor
    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    // Method to add a person to the directory
    public void addPerson(Person person) {
        personList.add(person);
    }

    // Method to remove a person from the directory
    public void removePerson(Person person) {
        personList.remove(person);
    }

    // Method to search persons by first name, last name, or street address
    public Person searchPerson(String searchValue) {
        for (Person person : personList) {
            if (person.getFname().equalsIgnoreCase(searchValue) ||
                person.getLname().equalsIgnoreCase(searchValue) ||
                person.getHomeAddress().getStreet().equalsIgnoreCase(searchValue) ||
                person.getWorkAddress().getStreet().equalsIgnoreCase(searchValue)) {
                return person;  // Return the matching person
            }
        }
        return null;  // Return null if no match is found
    }

    // Method to update a person (this is handled in the GUI by fetching the object and modifying it)
    public void updatePerson(Person person, String firstName, String lastName, int age, String ssn,
                             Address homeAddress, Address workAddress) {
        person.setFname(firstName);
        person.setLname(lastName);
        person.setAge(age);
        person.setSsn(ssn);
        person.setHomeAddress(homeAddress);
        person.setWorkAddress(workAddress);
    }

    // Method to return all persons
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    // Method to list persons in a format suitable for displaying in a table (only necessary fields)
    public Object[][] getPersonListForDisplay() {
        Object[][] data = new Object[personList.size()][5]; // For simplicity, returning 5 columns
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            data[i][0] = person.getFname();
            data[i][1] = person.getLname();
            data[i][2] = person.getHomeAddress().getCity();
            data[i][3] = person.getHomeAddress().getZip();
            data[i][4] = person.getWorkAddress().getCity();
        }
        return data;
    }
   
}

