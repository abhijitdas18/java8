package com.abhi.java8features.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLazinessTest {

    static class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }




    public static void main(String[] args)  throws InterruptedException{
        List<Employee> empList = new ArrayList<>();

        //Creating Employee list
        for(int i =0 ; i< 1000000; i++) {
            empList.add(new StreamLazinessTest.Employee(i, "name-" + i));
        }

        // Only intermediate operations
        //It create just another streams, not perform any operations
        Stream<String> empNameStream = empList.parallelStream()
                .filter(emp -> emp.id % 2 == 0)
                .map(emp -> {
                    System.out.println("In Map : " + emp.getName());
                    return emp.getName();
                });

        // Adding some delay to make nothing has happened till now
        Thread.sleep(2000);
        System.out.println("Sleep for 2 sec");
        // Terminal operation on the stream and it will invoke the Intermediate operations filter and map
        empNameStream.collect(Collectors.toList());
    }
}
