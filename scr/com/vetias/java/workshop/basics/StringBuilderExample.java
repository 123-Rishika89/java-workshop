package com.vetias.java.workshop.basics;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(", ").append("is");
        sb.append(", ").append("the");
        sb.append(", ").append("most");
        sb.append(", ").append("used");
        sb.append(", ").append("language");
        sb.append(", ").append("for");
        sb.append(", ").append("Enterprise");
        sb.append(", ").append("Applications");
        System.out.println(sb.toString());
        
    }

}
