package com.java8.funcProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs List<Instructor> and second is predicate which will filter if instructor has online
        //courses and return a map<String, Integer>, <name, yearsOfExperience>.

        Predicate<Instructor> p1 = Instructor::isOnlineCourses;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction =
                ((instructors, instructorPredicate) -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors.forEach(instructor -> {
                        if(p1.test(instructor)){
                            map.put(instructor.getName(), instructor.getYearsOfExperience());
                        }
                    });
                    return map;
                });
        System.out.println(mapBiFunction.apply(Instructors.getAll(), p1));
    }
}
