package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ListMark {
    public static void main(String[] args) {
        List<String>marks = new ArrayList<>();
        marks.add("90");
        marks.add("60");
        marks.add("70");
        marks.add("95");
        marks.add("80");
        marks.add("100");
        Collections.sort(marks);
        System.out.println("Ascending Order");
        System.out.println(marks);
        System.out.println("Descending Order");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
        
    }

}
