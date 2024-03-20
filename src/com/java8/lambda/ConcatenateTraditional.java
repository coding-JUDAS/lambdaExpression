package com.java8.lambda;

public class ConcatenateTraditional implements IConcatenate{
    @Override
    public String sConcat(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.sConcat("Hello", "World !"));

        // Lambda Implementation
        IConcatenate iConcatenate = (a, b) -> a + " " + b;
        System.out.println("Lambda concat implementation. . .");
        System.out.println(iConcatenate.sConcat("Hello", "World: by Lambda"));
    }
}
