package com.demoqa.enums;

import java.util.Random;

public enum MonthsEnums {
    January, February, March, April, May, June, July, August, September,
    October, November,December;

    private static final Random r = new Random();
    public static MonthsEnums randomMonthsEnums()  {
        MonthsEnums[] monthsEnums = values();

        return monthsEnums[r.nextInt(monthsEnums.length)];
    }
}
