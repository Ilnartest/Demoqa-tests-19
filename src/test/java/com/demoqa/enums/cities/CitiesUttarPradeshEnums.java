package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesUttarPradeshEnums {
    Agra,
    Lucknow,
    Merrut;

    private static final Random r = new Random();
    public static CitiesUttarPradeshEnums getRandomCitiesUttarPradesh() {

        CitiesUttarPradeshEnums [] citiesUttarPradeshEnums = values();
        return citiesUttarPradeshEnums[r.nextInt(citiesUttarPradeshEnums.length)];
    }
}
