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
public class PersonDirectory {
    
    ArrayList<Person> personList;

    public PersonDirectory(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.personList = personList;
    }
    
    public void addNewPerson(Person person){
        personList.add(person);
    }
    
}
