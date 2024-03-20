package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        //Get a list of all the courses which instructors offer
        Set<String> instructorCourses = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(instructorCourses);
    }
}
