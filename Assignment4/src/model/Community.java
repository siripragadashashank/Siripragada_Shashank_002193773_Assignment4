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
public class Community {
    private String communityName;
    
    private ArrayList<House> communityHouses;

    public Community(String communityName, ArrayList<House> communityHouses) {
        this.communityName = communityName;
        this.communityHouses = communityHouses;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getCommunityHouses() {
        return communityHouses;
    }

    public void setCommunityHouses(ArrayList<House> communityHouses) {
        this.communityHouses = communityHouses;
    }
    
    @Override
    public String toString() {
        return communityName;
    }
    
}
