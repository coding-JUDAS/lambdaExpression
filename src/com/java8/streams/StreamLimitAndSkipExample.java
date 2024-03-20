package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> limitFiveNumbers = numbers.stream().limit(5).collect(Collectors.toList());
        limitFiveNumbers.forEach(System.out::println);

        System.out.println("--------------------");
        List<Integer> skipFiveNumbers = numbers.stream().skip(5).toList();
        skipFiveNumbers.forEach(System.out::println);
    }
}
