package com.vetias.java.workshop.stream;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        List<Integer> markList = Arrays.asList(90,99,98,78,100);
        markList.stream().sorted().forEach(System.out::println);
        markList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(markList.stream().max(Comparator.naturalOrder()).get());







    }

}
