/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sirip
 */
public class House {
    private String houseName;
    private ArrayList<Person> persons;
    
    public House(String houseName, ArrayList<Person> persons) {
        this.houseName = houseName;
        this.persons = persons;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    @Override
    public String toString() {
        return houseName;
    }
    
}
