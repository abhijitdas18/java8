package com.abhi.java8features.performance;

import java.util.ArrayList;
import java.util.List;

public class IterationCollection {
    static List<Integer> myList = new ArrayList<>();

    public static void main(String[] args) {

        for(int i = 0 ; i< 50000000; i++) {
            myList.add(i);
        }
        int result = 0;
        long loopStartTime= System.currentTimeMillis();
        for(int i: myList){
            if(i % 2 == 0) {
                result += i;
            }
        }
        long loopEndTime= System.currentTimeMillis();
        System.out.println("Result : " + result);
        System.out.println("Loop total time: " + (loopEndTime - loopStartTime));

        long streamStartTime = System.currentTimeMillis();
        int res = myList.stream()
                .filter(value -> value % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        long streamEndTime = System.currentTimeMillis();
        System.out.println("Result : " + res);
        System.out.println("Stream Loop total time: " + (streamEndTime - streamStartTime));

        long parallelStreamStartTime = System.currentTimeMillis();
        int resParallel = myList.parallelStream()
                .filter(value -> value % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        long parallelStreamEndTime = System.currentTimeMillis();

        System.out.println("Result Parallel: " + res);
        System.out.println("Parallel Stream Loop total time: " + (parallelStreamEndTime - parallelStreamStartTime));


    }
}
