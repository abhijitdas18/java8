package com.abhi.java8features.defaultstatic;

public class DefaultTest extends Parent implements ParentFunctionalInterface{

    public static void main(String[] args) {
        DefaultTest dt = new DefaultTest();
        dt.show();  // class having more precedence than interface
    }
}


class Parent {
    public void show () {
        System.out.println("I am in parent class");
    }
}

