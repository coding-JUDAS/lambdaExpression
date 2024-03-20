package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        //stream min function - returns optional
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        if(min.isPresent())
            System.out.println(min);

        //reduce function
        //returns int
        int result = numbers.stream().reduce(0, (a,b) -> a<b?a:b);
        System.out.println(result);
        //returns Optional
        Optional<Integer> result1 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        if(result1.isPresent())
            System.out.println(result1.get());

        Optional result2 = numbers.stream()
                .reduce(Integer::min);
        if(result2.isPresent())
            System.out.println(result2.get());
    }
}
