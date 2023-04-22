package com.demoqa.enums;

import java.util.Random;

public enum GendersEnums {
    MALE("Male"), FEMALE("Female"), OTHER("Other");

    private String name;
    GendersEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }
    public static String randomGendersEnums()  {
        Random r = new Random();
        GendersEnums[] gendersEnums = values();

        return gendersEnums[r.nextInt(gendersEnums.length)].getName();
    }
}