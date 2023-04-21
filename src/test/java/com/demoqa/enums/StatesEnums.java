package com.demoqa.enums;
import java.util.Random;
public enum StatesEnums {
    NCR("NCR"),UTTAR_PRADESH("Uttar Pradesh"),HARYANA("Haryana"),RAJASTHAN("Rajasthan");

    private String name;
    StatesEnums(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static String randomStatesEnums() {
        final Random r = new Random();
        StatesEnums[] statesEnums = values();
        return statesEnums[r.nextInt(statesEnums.length)].getName();
    }
}