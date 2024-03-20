package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll()
                .stream().findAny();
        if(instructorOptional.isPresent())
            System.out.println(instructorOptional.get());

        instructorOptional = Instructors.getAll()
                .stream().findFirst();
        if(instructorOptional.isPresent())
            System.out.println(instructorOptional.get());
    }
}
