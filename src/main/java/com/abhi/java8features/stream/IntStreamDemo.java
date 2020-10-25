package com.abhi.java8features.stream;

import java.util.stream.IntStream;

// IntStream - IntStream range(int startInclusive, int endExclusive) returns a sequential ordered IntStream
// from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
public class IntStreamDemo {
    public static void main(String [] ar) {

        //sum of int from 1 - 5 (1 + 2+ 3+ 4)
        System.out.println("Sum: "+ IntStream.range(1,5).sum());

        IntStream.range(1,5).forEach(s-> System.out.println(s));

        //OptionalInt
        System.out.println("Max:" + IntStream.range(1,5).max());


    }
}
