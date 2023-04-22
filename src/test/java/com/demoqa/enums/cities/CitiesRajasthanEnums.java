package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesRajasthanEnums {
    JAIPUR("Jaipur"), JAISELMER("Jaiselmer");
    private String name;
    CitiesRajasthanEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }

    public static String getRandomCitiesRajasthan() {
        Random r = new Random();
        CitiesRajasthanEnums[] citiesRajasthanEnums = values();
        return citiesRajasthanEnums[r.nextInt(citiesRajasthanEnums.length)].getName();
    }
}
