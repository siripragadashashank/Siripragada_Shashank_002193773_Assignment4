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
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> PatientList) {
        this.patientList = PatientList;
    }
    
    public void addNewPatient(Patient patient){
        patientList.add(patient);
    }
    
}
