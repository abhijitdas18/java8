package com.abhi.java8features.streamnew;

import java.util.Arrays;
import java.util.List;

// Stream - Intermediate ( filter, map, sorted return a stream) and
// terminal operations ( forEach)
// map - Intermediate.
public class MapExample {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("c5","a1", "b1", "c1", "c2", "b3");

        System.out.println("Given list :");
        myList.stream().forEach(x-> System.out.println(x));

        System.out.println("Start with c, uppercase, sorted :");
        // Filter
        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(x->x.toUpperCase())
                .sorted()
                .forEach(x-> System.out.println(x));


        System.out.println("Modified and Average 1,2,3: ");
        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::print);


        System.out.println("average of even numbers : ");
        List<Integer> numberList = Arrays.asList(2,5,67,12,98);
        numberList.stream()
                .map(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));

    }
}
