package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesUttarPradeshEnums {
    AGRA("Agra"), LUCKNOE("Lucknow"), MERRUT("Merrut");
    private String name;
    CitiesUttarPradeshEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }

    public static String getRandomCitiesUttarPradesh() {
        Random r = new Random();
        CitiesUttarPradeshEnums [] citiesUttarPradeshEnums = values();
        return citiesUttarPradeshEnums[r.nextInt(citiesUttarPradeshEnums.length)].getName();
    }
}
