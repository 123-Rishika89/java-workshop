package com.vetias.java.workshop.basics.string;


import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;

public class WordCountTest {

    @Test
    public void testWordCount(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is a java program");
        Assertions.assertEquals(5,count);
    }    
    
    @Test
    public void testAnotherString(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("Rishika gurl");
        Assertions.assertEquals(2,count);
    }
}


