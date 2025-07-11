package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class NamesStartsWithSCount {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("Rishika");
        names.add("Pramisha");
        names.add("Dhanushya");
        names.add("Srinithi");
        names.add("Sree vishnuprirya");
        long nameCount = names.stream()
        .filter(name -> name.startsWith("S")).count();
        System.out.println(nameCount);

    }



}
