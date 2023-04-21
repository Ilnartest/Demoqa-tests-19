package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesNCREnums {
    Delhi,
    Gurgaon,
    Noida;
    private static final Random r = new Random();
    public static CitiesNCREnums getRandomCitiesNCR () {

        CitiesNCREnums[] citiesNCREnums = values();
        return citiesNCREnums[r.nextInt(citiesNCREnums.length)];
    }
}
