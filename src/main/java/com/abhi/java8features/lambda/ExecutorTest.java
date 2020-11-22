package com.abhi.java8features.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("Inside run()");
            System.out.println("Thread name : " + Thread.currentThread().getName());
        });

        executorService.shutdown();
    }
}
