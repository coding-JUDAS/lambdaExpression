package com.java8.funcProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // if number > 10 return true otherwise false
        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(100));

        // i > 10 && number is even (i%2 == 0)
        System.out.println("------------");
        Predicate<Integer> p2 = (i) -> i%2==0;
        System.out.println(p1.and(p2).test(20));

        System.out.println("--------------------");
        //i>10 || i is even
        System.out.println(p1.or(p2).test(4));

        System.out.println("---------------------");
        // i>0 && i%2 != 0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
