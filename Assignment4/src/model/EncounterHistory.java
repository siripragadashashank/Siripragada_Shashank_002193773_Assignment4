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
public class EncounterHistory {
    private ArrayList<Encounter> encounters;

    public EncounterHistory(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
     
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounters;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounters = encounterHistory;
    }
    
    
}
