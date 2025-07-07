package com.vetias.java.workshop.temperaturedata.beans;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Rishika";
        
        String shortName = "Rishi";
        String buddyName = new String ("Rishika");
        System.out.println(firstName == shortName);
        // System.out.println(firtName == bubbyName);
        // String fullName = firstName+""+lastName;
        // String finalName = firstName.concat(lastName);
    //     System.out.println(finalName.toUpperCase());
        String sentance = "This is program shows how can we spilt a string into multiple string";
        String words[] = sentance.split("");
        System.out.println(words.length);
    }

}




















