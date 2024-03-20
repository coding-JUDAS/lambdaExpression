package com.java8.funcProgramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        //Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;
        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;
        Instructors.getAll().forEach(instructor -> {
            if(p2.test(instructor)){
                System.out.println(instructor);
            }
        });
    }
    public static boolean greaterThanTenYearsOfExperience(Instructor instructor){
        return instructor.getYearsOfExperience() > 10;
    }
}
