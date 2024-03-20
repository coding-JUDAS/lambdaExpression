package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOperationsExample {
    public static void main(String[] args) {
        //count
        Long count = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                //.distinct()
                .count();
        System.out.println(count);

        //distinct
        List<String> instructorCourses = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(instructorCourses);

        //anyMatch, allMatch and nonMatch
        boolean match = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s -> s.startsWith("j"));
        System.out.println(match);
    }
}
