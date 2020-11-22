package com.abhi.java8features.lambda;

public class ThreadTest {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("This is inside run()");
            System.out.println("Thread name : " + Thread.currentThread().getName());
        };
        runnable.run(); // main thread running

        Thread thread = new Thread(runnable);
        thread.start(); // Actual thread is spawned

        System.out.println("DONE"); // part of main thread
    }
}
