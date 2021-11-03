/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author sirip
 */
public class CityList {
    private static ArrayList<City> citiesList  = new ArrayList<City>(){
        {
            add(new City("Boston", new ArrayList<Community>()));
        }   
    };

    public static ArrayList<City> getCitiesList() {
        return citiesList;
    }

    public static void setCitiesList(ArrayList<City> citiesList) {
        CityList.citiesList = citiesList;
    }
    
    public static void addCity(City cityName){
        CityList.getCitiesList().add(cityName);
    }
    
}
