package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //returning all instructors sorted by name
        List<Instructor> list = Instructors.getAll()
                .stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .toList();
        list.forEach(System.out::println);
    }
}
