package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Mike", "Syed", "Rajeev"));
        System.out.println("-----------------------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("--------------------------");
        System.out.println(names);

        System.out.println("---------------------------");
        System.out.println("Traverse Collection externally. . .");
        for(String name: names)
            System.out.println(name);

        System.out.println("----------------------------");
        System.out.println("Iterate over a stream internally");
        //Stream<String> nameStream = new Stream();
        //Streams are 1-directional i.e., can only be traversed once after terminal operation,
        // then Stream is closed.
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
    }
}
