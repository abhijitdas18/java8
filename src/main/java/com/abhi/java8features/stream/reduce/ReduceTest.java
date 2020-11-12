package com.abhi.java8features.stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// The reduction operation combines all elements of the stream into a single result.
// reduces a stream of elements to exactly one element of the stream.
public class ReduceTest {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person(10," Abhi"),
                new Person(21, "Ravi"),
                new Person(11, "Madhu")
        );

        personList.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out :: println);
    }
}
