package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesRajasthanEnums {
    Jaipur,
    Jaiselmer;

    private static final Random r = new Random();
    public static CitiesRajasthanEnums getRandomCitiesRajasthan() {

        CitiesRajasthanEnums[] citiesRajasthanEnums = values();
        return citiesRajasthanEnums[r.nextInt(citiesRajasthanEnums.length)];
    }
}
