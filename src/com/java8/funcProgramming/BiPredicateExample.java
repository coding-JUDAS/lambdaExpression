package com.java8.funcProgramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        // all instructors who teach online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses()==true;
        // instructor experience > 10
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;
        // BiPredicate
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online==true && experience>10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer =
                (name, courses) -> System.out.println("name is: " + name + " course: " + courses);

        instructors.forEach(instructor -> {
            if(p3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())){
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
