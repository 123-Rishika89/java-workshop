package main.java.com.vetias.javaworkshop.basics.arrays;
import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Double[]prices ={30.46,41.90,23.56,45.89,20.00};
        Arrays.sort(prices,Collections.reverseOrder());
        System.out.println("list in descending order");
        for(Double price:prices)
        {
            System.out.println(price);
        }
    }
    
}

