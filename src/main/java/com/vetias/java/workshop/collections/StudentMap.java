package com.vetias.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1006, "Rishika");
        students.put(1007, "Pramisha");
        students.put(1205, "Arthi");
        students.put(1304, "Srinithi");
        students.put(1401, "Dhanushya");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }

}
