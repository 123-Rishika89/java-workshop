package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDate;


public class TemperatureApplication {
    public static void main(String[] args) {
        Oranganaization vet = new Oranganaization("Vellar Education Trust",
        "Thinal Erode","www.vetias.ac.in","rishikas24csa@vetias.ac.in",
        "0423345678",123,LocalDate.of(1960, 07,21));
        System.out.println(vet);
        System.out.println(vet.name());
        System.out.println(vet.completeAddress());
        System.out.println(vet.website());
        System.out.println(vet.email());
        System.out.println(vet.contactNumber());
        System.out.println(vet.registrationNumber());
        System.out.println(vet.registrationDate());


    }

}
