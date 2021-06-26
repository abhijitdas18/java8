package com.abhi.java8features.defaultstatic;

@FunctionalInterface
public interface FunctionalInterface05 {
    void show();

    static void display() {
        System.out.println("FunctionalInterface05-display() a static method in FunctionalInterface");
    }
}
