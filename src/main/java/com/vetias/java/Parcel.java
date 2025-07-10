package com.vetias.java;
import java.util.Arrays;

public class Parcel {   
    public static void main(String[]args){
        double[] prices = {19.00,4.99,9.89,6.98,6.78};
        
        Arrays.sort(prices);

        System.out.println("prices list in ascending order");
        for (double price : prices) {
            System.out.println(price);
        }
    } 
}


