package com.vetias.java.workshop.temperaturedata.beans;

public class TemperatureSensor implements Sensor  {
    private float temperature;
    public TemperatureSensor(float aTemperature){
        temperature=aTemperature;
    }

    public float getReading(){
        return temperature;
    }    
    }
