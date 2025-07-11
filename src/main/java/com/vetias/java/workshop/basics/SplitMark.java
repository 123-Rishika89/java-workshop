package com.vetias.java.workshop.basics;

public class SplitMark {
    public static void main(String[]args)
    {
        int []marks={99,98,97,96,99};
        int[] first =new int[3];
        int [] second = new int[2];
        System.arraycopy(marks,0 ,first,0,3 );
        System.arraycopy(marks,3,second,0,2);
        System.out.println("first three numbers:");
        for(int mark:first)
        {
            System.out.println(mark);
        }
        System.out.println("second two numbers:");
        for(int mark:second)
        {
            System.out.println(mark);
        }

    }
    
}


