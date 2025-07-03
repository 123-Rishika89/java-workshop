package com.vetias.java.workshop.temperaturedata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String postalCode;

    public void setName(String aName){
        name = aName;
    }

    public String getName(){
        return name;
    }
}