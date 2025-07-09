package com.vetias.java.workshop.Standardlib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharaterBaseReaderExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error Readerfile: ");
            e.printStackTrace();
        }
    }

}
