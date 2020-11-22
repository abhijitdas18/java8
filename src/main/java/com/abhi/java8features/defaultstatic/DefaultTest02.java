package com.abhi.java8features.defaultstatic;

public class DefaultTest02 implements ParentFunctionalInterface, ParentFunctionalInterface02{
    // Must to override to resolve the ambiguity
    @Override
    public void show() {
        System.out.println("I am in DefaultTest02-show()");
    }

    public static void main(String[] args) {
        DefaultTest02 dt = new DefaultTest02();
        dt.show();
        dt.display();
    }
}
