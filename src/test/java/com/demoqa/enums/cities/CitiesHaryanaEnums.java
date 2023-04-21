package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesHaryanaEnums {
    Karnal,
    Panipat;
    private static final Random r = new Random();
    public static CitiesHaryanaEnums getRandomCitiesHaryana() {

        CitiesHaryanaEnums[] citiesHaryanaEnums = values();
        return citiesHaryanaEnums[r.nextInt(citiesHaryanaEnums.length)];
    }
}


