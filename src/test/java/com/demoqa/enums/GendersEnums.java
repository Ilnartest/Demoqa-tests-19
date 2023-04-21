package com.demoqa.enums;

import java.util.Random;

public enum GendersEnums {
   Male, Female, Other;

    private static final Random r = new Random();
    public static GendersEnums randomGendersEnums()  {
        GendersEnums[] gendersEnums = values();

        return gendersEnums[r.nextInt(gendersEnums.length)];
    }



}