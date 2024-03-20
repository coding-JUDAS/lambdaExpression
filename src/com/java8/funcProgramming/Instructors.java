package com.java8.funcProgramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("mike",10, "Software Developer", "m",true,
                Arrays.asList("Java Programming", "c++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("jenny",5, "Engineer", "f",false,
                Arrays.asList("Multi-Threaded Programming", "CI/CD", "Unit Testing"));
        Instructor instructor3 = new Instructor("jean",6, "Software Developer", "m",false,
                Arrays.asList("c++ Programming", "C Programming", "Reactive Native"));
        Instructor instructor4 = new Instructor("anthony",15, "Software Developer", "m",true,
                Arrays.asList("Java Programming", "Angular Programming", "React Native"));
        Instructor instructor5 = new Instructor("sayed",15, "Principal Engineer", "m",true,
                Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));

        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
        return list;
    }
}
