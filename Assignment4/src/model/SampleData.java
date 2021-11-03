/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.City;
import model.Encounter;
import model.EncounterHistory;
import model.VitalSigns;
import model.House;
import model.System;
import model.Patient;


/**
 *
 * @author sirip
 */
public class SampleData {
    
    public static System initData(){
        
        
        VitalSigns vsE1P1 = new VitalSigns(60.20,90, 87.6,120,38,90.0,19.1);
        VitalSigns vsE2P1 = new VitalSigns(63.45,99, 87.6,120,37,90.0,18.1);
        VitalSigns vsE3P1 = new VitalSigns(58.21,89, 87.6,120,39,90.0,18.1);

        Encounter e1P1 = new Encounter(vsE1P1);
        Encounter e2P1 = new Encounter(vsE2P1);
        Encounter e3P1 = new Encounter(vsE3P1);

        ArrayList<Encounter> encountersP1 = new ArrayList<Encounter>();
        encountersP1.add(e1P1);
        encountersP1.add(e2P1);
        encountersP1.add(e3P1);
        EncounterHistory ehP1 = new EncounterHistory(encountersP1);
        
        Patient pat1 = new Patient(ehP1);
        Person per1 = new Person("Luke Skywalker", 25.5, pat1);
        
        VitalSigns vsE1P2 = new VitalSigns(60.20,90, 87.6,120,38,90.0,19.1);
        VitalSigns vsE2P2 = new VitalSigns(63.45,99, 87.6,120,37,90.0,18.1);
        VitalSigns vsE3P2 = new VitalSigns(58.21,89, 87.6,120,39,90.0,18.1);

        Encounter e1P2 = new Encounter(vsE1P2);
        Encounter e2P2 = new Encounter(vsE2P2);
        Encounter e3P2 = new Encounter(vsE3P2);

        ArrayList<Encounter> encountersP2 = new ArrayList<Encounter>();
        encountersP2.add(e1P2);
        encountersP2.add(e2P2);
        encountersP2.add(e3P2);
        EncounterHistory ehP2 = new EncounterHistory(encountersP2);
        
        Patient pat2 = new Patient(ehP2);
        Person per2 = new Person("Anakin Skywalker", 50, pat2);
       
        ArrayList<Person> house1Persons = new ArrayList<Person>();
        house1Persons.add(per1);
        house1Persons.add(per2);
        
        House house1 = new House("12 Millennium Falcon ST",house1Persons);
        ArrayList<House> jphouses = new ArrayList<>();
        jphouses.add(house1);
        
        Community comm1 = new Community("Jamaica Plain",jphouses);
        ArrayList<Community> jpCommunities = new ArrayList<>();
        jpCommunities.add(comm1);
        
        City bostonCity = new City("Boston", jpCommunities);
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(bostonCity);
        
//        //MissionHill
//        //Person1
//        VitalSigns vsE1P1MH = new VitalSigns(60.20,90,5.11,38,90.0,19.1);
//        VitalSigns vsE2P1MH = new VitalSigns(63.45,99,6.00,37,90.0,18.1);
//        VitalSigns vsE3P1MH = new VitalSigns(58.21,89,6.00,39,90.0,18.1);
//
//        //Person2
//        VitalSigns vsMHPerson2visit1 = new VitalSigns(65.20,90.5,5.70,39.8,94,19,95.58,new Date(),new Date(),"System","System");
//        VitalSigns vsMHPerson2visit2 = new VitalSigns(64.60,95.5,5.70,40.5,93,20,97.78,new Date(),new Date(),"System","System");
//
//        //Roxubory
//        //Person1
//        VitalSigns vsRBPerson1visit1 = new VitalSigns(46.20,83.5,5.10,38.8,95,19,99.50,new Date(),new Date(),"System","System");
//        VitalSigns vsRBPerson1visit2 = new VitalSigns(48.45,83.5,5.10,38.7,96,19,98.50,new Date(),new Date(),"System","System");
//        
//        //Person2
//        VitalSigns vsRBPerson2visit1 = new VitalSigns(55.20,86.5,5.10,38.8,95,19,97.50,new Date(),new Date(),"System","System");
//        
//        List<City> cities = new ArrayList<>();
//        cities.add(bostonCity);
        
        
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(per1);
        personList.add(per2);
        PersonDirectory personDirectory = new PersonDirectory(personList);
        
        ArrayList<Patient> patientsList = new ArrayList<Patient>();
        patientsList.add(pat1);
        patientsList.add(pat2);
        PatientDirectory patientDirectory = new PatientDirectory(patientsList);
        System system = new System(patientDirectory, personDirectory, cities);
        
        return system;
    } 
       
}
