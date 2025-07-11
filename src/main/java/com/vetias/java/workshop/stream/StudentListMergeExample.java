package com.vetias.java.workshop.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentListMergeExample {
    public static void main(String[] args) {
        
    
    List<Integer> csRollNos = Arrays.asList(1003,1007,1010,1015);
    List<Integer> csRollNos1 = Arrays.asList(1001,1004,1011,1002);
    List<Integer> allRollNos = Stream.concat(csRollNos.stream(),csRollNos1.stream())
    .sorted().toList();
    System.out.println(allRollNos);
    }
}
