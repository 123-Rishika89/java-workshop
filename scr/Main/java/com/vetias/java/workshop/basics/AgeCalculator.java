package com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter you Date of Birth(YYYY-MM-DD)");
        int year=inputScanner.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-year;
        System.out.println(age);


    }

}
