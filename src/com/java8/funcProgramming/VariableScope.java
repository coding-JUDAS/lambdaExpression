package com.java8.funcProgramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScope {
    public static void main(String[] args) {
        int b = 10; // Local variable
        //cannot have variable with same name as LOCAL variable e.g. b...
        IntConsumer intConsumer = (a) -> System.out.println(a*10);

        //cannot modify variable declared in LOCAL scope. Define var is STATIC in order to allow modification
        // inside lambda expression.
        int k= 10;
        List<Instructor> instructorList = Instructors.getAll();
        instructorList.forEach(instructor -> {
            System.out.println(instructor + " " + k);
        });
       // k = 6; is an error
    }
}
