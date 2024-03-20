package com.java8.funcProgramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        IInstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("mike", 10, "Software Developer, ",
                "m", true, Arrays.asList("Java Programming", "c++ Programming", "Python Programming"));
        System.out.println(instructor);
    }
}
