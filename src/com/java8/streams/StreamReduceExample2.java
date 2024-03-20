package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has the highest years of experience
        Optional<Instructor> result = Instructors.getAll().stream()
                .reduce((s1, s2) -> (s1.getYearsOfExperience() > s2.getYearsOfExperience()) ? s1 : s2);
        System.out.println(result.get());
    }
}
