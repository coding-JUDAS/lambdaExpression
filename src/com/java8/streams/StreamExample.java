package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //create a map of names and course of instructors who teach
        //online and have more than 10 years experience

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience()>10;

        List<Instructor> instructors = Instructors.getAll();
        Map<String, List<String>> map = instructors.stream()
                .peek(System.out::println)
                .filter(p1)
                .peek(System.out::println)
                .filter(p2)
                .peek(System.out::println)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);
    }
}
