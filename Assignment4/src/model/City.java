/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author sirip
 */
public class City {
    private String cityName;
    
    private List<Community> Communities;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Community> getCommunities() {
        return Communities;
    }

    public void setCommunities(List<Community> Communities) {
        this.Communities = Communities;
    }
    
    
}
