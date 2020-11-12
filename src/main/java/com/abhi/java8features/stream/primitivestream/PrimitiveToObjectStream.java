package com.abhi.java8features.stream.primitivestream;

import java.util.Arrays;

public class PrimitiveToObjectStream {
    public static void main(String[] args) {
        Arrays.stream(new int[] {1,2,3} )
                .mapToObj(x -> x + " - ConvertedToObj")
                .forEach(x-> System.out.println(x));
    }
}
