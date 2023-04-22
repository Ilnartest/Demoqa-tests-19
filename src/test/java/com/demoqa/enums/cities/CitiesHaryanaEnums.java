package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesHaryanaEnums {
    KARNAL("Karnal"), PANIPAT("Panipat");
    private String name;
    CitiesHaryanaEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }

    public static String getRandomCitiesHaryana() {
        Random r = new Random();
        CitiesHaryanaEnums[] citiesHaryanaEnums = values();
        return citiesHaryanaEnums[r.nextInt(citiesHaryanaEnums.length)].getName();
    }
}


