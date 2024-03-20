package com.java8.funcProgramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() + " the value of x: " + x);
        c.accept("Up in the air");

        // Consumer with BLOCK statement
        Consumer<Integer> d = (x) -> {
            System.out.println("x*x = " + x*x);
            System.out.println("x/x = " + x/x);
        };

        d.accept(10);
    }
}
