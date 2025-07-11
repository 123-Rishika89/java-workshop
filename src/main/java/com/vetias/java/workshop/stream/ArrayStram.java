package com.vetias.java.workshop.stream;
import java.util.Arrays;
import java.util.Stream.IntStream;
public class ArrayStram {
    public static void main(String[] args) {
        int[] marks ={90,100,55,30,87};
        long numberOfSubjectsPassed = Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println(numberOfSubjectsPassed);

        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectsPassed = markStream
        .filter(mark -> mark> 40).count();
    }

}
