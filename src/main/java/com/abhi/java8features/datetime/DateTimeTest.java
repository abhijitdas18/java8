package com.abhi.java8features.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class DateTimeTest {

    public static void main(String[] args) {


        System.out.println("All zones :");
        Set zones = ZoneId.getAvailableZoneIds();
        zones.forEach(z-> System.out.println(z));

        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate now :" + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime now :" +lt);

        System.out.println(LocalDate.now().isLeapYear());

        System.out.println(LocalDate.now().getDayOfWeek());

    }
}
