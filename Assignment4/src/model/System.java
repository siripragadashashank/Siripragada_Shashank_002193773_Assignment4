/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sirip
 */
public class System {
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private ArrayList<City> cities;

    public System(PatientDirectory patientDirectory, PersonDirectory personDirectory, ArrayList<City> cities) {
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        this.cities = cities;
    }
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    public void addCity(City cityName){
        this.cities.add(cityName);
    }
    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    
}
