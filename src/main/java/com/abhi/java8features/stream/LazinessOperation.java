package com.abhi.java8features.stream;

import java.util.stream.Stream;

public class LazinessOperation {
    public static void main(String[] args) {

        System.out.println("Intermediate operation is not triggered.");
        Stream.of("a1","b2","c3","d4")
                .filter( x-> {
                    System.out.print("(" + x + " Intermediate )");
                    return true;
                });

        System.out.println("\nIntermediate operation is triggered.");
        Stream.of("a1","b2","c3","d4")
                .filter( x-> {
                    System.out.print("(" + x + " Intermediate )");
                    return true;
                })
        .forEach(s -> System.out.println("(" + s + " Terminal )"));

    }
}
