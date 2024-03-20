package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // max using stream max func.
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        if(max.isPresent())
            System.out.println(max);

        int max2 = numbers.stream().reduce(0, (a,b) -> a>b? a:b);
        System.out.println(max2);
    }
}
