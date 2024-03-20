package com.java8.funcProgramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println("Square root of 64: " + sqrt.apply(64));
        System.out.println("Square root of 81: " + sqrt.apply(81));

        System.out.println("--------------------------------------------");
        Function<String, String> lowerCAseFunction = String::toLowerCase;
        System.out.println(lowerCAseFunction.apply("PROGRAMMING"));
        Function<String, String> concatFunction = (s) -> s.concat(" In Java");

        System.out.println(lowerCAseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowerCAseFunction.compose(concatFunction).apply("PROGRAMMING"));
    }
}
