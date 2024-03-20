package com.java8.funcProgramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses()==true;
        Predicate<Instructor> p1MR = Instructor::isOnlineCourses;
        //System.out.println("Lambda: " + p1 + ", Method Reference: " + p1MR);

        Function<Integer, Double> srt = (n) -> Math.sqrt(n);
        Function<Integer, Double> sqrtMR = Math::sqrt;
        System.out.println("Lambda: " + srt.apply(16) + ", Method Reference: " + sqrtMR.apply(16));

        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        Function<String, String> lowerCaseFunction1 = String::toLowerCase;
        System.out.println("Lambda: " + lowerCaseFunction.apply("NTABOZUKO")
                + ", Method Reference: " + lowerCaseFunction1.apply("NTABOZUKO"));
    }
}
