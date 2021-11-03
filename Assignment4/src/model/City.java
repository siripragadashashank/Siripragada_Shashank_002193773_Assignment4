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
public class City {
    private String cityName;
    
    private ArrayList<Community> Communities;

    public City(String cityName, ArrayList<Community> Communities) {
        this.cityName = cityName;
        this.Communities = Communities;
    }
    public City(String cityName) {
        this.cityName=cityName;
        this.Communities= new ArrayList<Community>();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunities() {
        return Communities;
    }

    public void addCommunity(Community community){
        this.Communities.add(community);
    }
    
    public void addCommunities(ArrayList<Community> communities){
        this.Communities.addAll(communities);
    }
    public void setCommunities(ArrayList<Community> Communities) {
        this.Communities = Communities;
    }
    
    @Override
    public String toString() {
        return cityName;
    }
}
