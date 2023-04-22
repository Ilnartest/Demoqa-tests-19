package com.demoqa.enums;

import java.util.Random;

public enum HobbiesEnums {

    SPORTS("Sports"), READING("Reading"), MUSIC("Music");
    private String name;
    HobbiesEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }
    public static String randomHobbiesEnums()  {
        Random r = new Random();
        HobbiesEnums[] hobbiesEnums = values();

        return hobbiesEnums[r.nextInt(hobbiesEnums.length)].getName();
    }
}
