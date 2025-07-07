package com.vetias.java.workshop.temperaturedata.beans;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "Rishika";
        String lastName = new String ("Vishnu");
        String shortName = "Rishi";
        String buddyName = new String ("Rishika");
        System.out.println(firstName);
        String fullName = firstName+""+lastName;
        String finalName = firstName.concat(lastName);
        System.out.println(finalName.toUpperCase());
    }

}




















