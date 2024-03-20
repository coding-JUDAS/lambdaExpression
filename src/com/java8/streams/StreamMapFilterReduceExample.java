package com.java8.streams;

import com.java8.funcProgramming.Instructor;
import com.java8.funcProgramming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience b/w instructor
        int totalYears = Instructors.getAll()
                .stream()
                .map(Instructor::getYearsOfExperience)
                .reduce(0, (a,b) -> a+b);
        System.out.println(totalYears);

        //total years of experience b/w instructor who teach online
        int totalYears1 = Instructors.getAll()
                .stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, (a,b) -> a+b);
        System.out.println(totalYears1);
    }
}
