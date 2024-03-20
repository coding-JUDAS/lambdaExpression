package com.java8.funcProgramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // print out the name and Gender of Instructors
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("name is: " + name +
                ", and gender is: " + gender);
        instructors.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender()));

        // printout name and list of courses
        BiConsumer<String, List<String>> biConsumer1 =
                (name, courses) -> System.out.println("name is: " + name + " Courses: " + courses);
        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getCourses());
        });

        // printout name and gender of all instructors who teaches online
        System.out.println("-------------------------------");
        instructors.forEach( instructor -> {
            if(instructor.isOnlineCourses()){
                biConsumer.accept(instructor.getName(), instructor.getGender());
            }
        });
    }
}
