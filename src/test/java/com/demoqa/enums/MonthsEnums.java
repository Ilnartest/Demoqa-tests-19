package com.demoqa.enums;

import java.util.Random;

public enum MonthsEnums {
    JANUARY("January"), FEBRUARY("February"), MARCH("March"), APRIL("April"), MAY("May"),
    JUNE("June"), JULY("July"), AUGUST("August"), SEPTEMBER("September"), OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");
    private String name;
    MonthsEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }
    public static String randomMonthsEnums()  {
        Random r = new Random();
        MonthsEnums[] monthsEnums = values();

        return monthsEnums[r.nextInt(monthsEnums.length)].getName() ;
    }
}
