package com.vetias.java.workshop.lambda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class SquareTest{

    @Test
    public void testSquare()
    { 
        Square square=(int x) -> x*x;
        Assertions.assertEquals(36,square.findSquare(6));

    }


}
