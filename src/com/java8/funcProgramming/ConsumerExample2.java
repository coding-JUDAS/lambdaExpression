package com.java8.funcProgramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // Looping through all the instructors and printing out the values of instructor
        Consumer<Instructor> c1 = System.out::println;
        instructors.forEach(c1);
        //instructors.forEach(System.out::println);

        // Loop through all the instructors and only print out their name
        Consumer<Instructor> c2 = (s2) -> System.out.print(s2.name);
        instructors.forEach(c2);

        System.out.println("-----");
        // Loop through all the instructors and print out their names and courses.
        Consumer<Instructor> c3 = (s3) -> System.out.println(s3.getCourses());
        instructors.forEach(c2.andThen(c3));

        // FILTER example
        // Loop through all the instructors and print out the name if the years of experience > 10.
        System.out.println("---------using FILTER example....");

        instructors.forEach(instructor -> {
            if(instructor.getYearsOfExperience() > 10){
                c1.accept(instructor);
            }
        });

        System.out.println();
        // Loop through all the instructors and print out the name and years of experience if
        // years of experience > 10 and teaches online courses.

        System.out.println();
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience > 5 && s1.isOnlineCourses()){
                c1.andThen(c2).accept(s1);
            }
        });
    }
}
