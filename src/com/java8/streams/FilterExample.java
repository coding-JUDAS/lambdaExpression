package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        //returning instructors sorted by their name and have more than 10 years of experience
        List<Instructor> list = Instructors.getAll()
                .stream()
                .filter(instructor -> instructor.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();
        list.forEach(System.out::println);
    }
}
