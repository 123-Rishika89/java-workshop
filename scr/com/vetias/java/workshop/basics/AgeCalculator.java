package com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int yearOfBirth = inputScanner.nextInt();
        int currentyear=LocalDate.now().getYear();

    }

}
