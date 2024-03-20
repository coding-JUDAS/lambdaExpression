package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        double multiple = numbers.stream().reduce(1, (a,b) -> a*b);
        System.out.println(multiple);

        // Binary Operator without accumulator -> returns Optional.
        Optional result = numbers.stream().reduce((a, b) -> a + b);
        if(result.isPresent())
            System.out.println(result.get());
    }
}
