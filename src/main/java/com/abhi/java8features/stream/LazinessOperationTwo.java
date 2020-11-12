package com.abhi.java8features.stream;

// Uppercase the string starts with "c" only and print
// map is called once the operation pipeline performs true
import java.util.stream.Stream;

public class LazinessOperationTwo {
    public static void main(String[] args) {
        Stream.of("aaa","bbb","ccc","ddd", "caa","xca", "c")
                .filter(x-> {
                    System.out.print("\nIn filter : " + x + ", ") ;
                    return (x.startsWith("c"));
                })
                .map(x -> {    // map will call if filter return true
                    System.out.println("\nIn map : " + x + ", ");
                    return x.toUpperCase();
                })
                .forEach(x-> System.out.println("forEach : " + x + ", "));
    }
}
