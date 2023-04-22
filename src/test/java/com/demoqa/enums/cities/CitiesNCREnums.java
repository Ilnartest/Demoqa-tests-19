package com.demoqa.enums.cities;

import java.util.Random;

public enum CitiesNCREnums {
    DELHI("Delhi"), GURGAON("Gurgaon"), NOIDA("Noida");
    private String name;
    CitiesNCREnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;

    }
    public static String getRandomCitiesNCR () {
        Random r = new Random();
        CitiesNCREnums[] citiesNCREnums = values();
        return citiesNCREnums[r.nextInt(citiesNCREnums.length)].getName();
    }
}
