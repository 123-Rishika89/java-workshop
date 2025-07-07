package com.vetias.java.workshop.basics;

public class Stringc {
    public static void main(String[] args) {
        String sentance = "This is program shows how can we split a " +
                    "string into multiple string.We need to find sentance," +
                     "word and letter count \"; ";
        String words[]=sentance.split(" ");
        String sentances[]=sentance.split("\\.");
        System.out.println(words.length);
        System.out.println(sentances.length);
        System.out.println("letters"+sentance.length());   

    }

    
}
