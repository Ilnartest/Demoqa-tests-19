package com.demoqa.utils;

import com.demoqa.enums.StatesEnums;
import com.demoqa.enums.cities.CitiesHaryanaEnums;
import com.demoqa.enums.cities.CitiesNCREnums;
import com.demoqa.enums.cities.CitiesRajasthanEnums;
import com.demoqa.enums.cities.CitiesUttarPradeshEnums;

import java.security.SecureRandom;
import java.util.Arrays;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.demoqa.enums.HobbiesEnums.randomHobbiesEnums;
import static com.demoqa.enums.MonthsEnums.randomMonthsEnums;
import static com.demoqa.enums.StatesEnums.*;
import static com.demoqa.enums.SubjectEnums.randomSubjectEnums;
import static com.demoqa.enums.cities.CitiesHaryanaEnums.getRandomCitiesHaryana;
import static com.demoqa.enums.cities.CitiesNCREnums.getRandomCitiesNCR;
import static com.demoqa.enums.cities.CitiesRajasthanEnums.getRandomCitiesRajasthan;
import static com.demoqa.enums.cities.CitiesUttarPradeshEnums.getRandomCitiesUttarPradesh;
import static com.demoqa.tests.TestData.state;


public class RandomUtils {
    static String[] genders = {"Male", "Female", "Other"};
    static String[] subject = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
            "Computer Science", "Commerce", "Accounting", "Economics", "Arts",
            "Social Studies", "History", "Civics"};
    static String[] hobbies = {"Sports", "Reading", "Music"};
    static String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {
        System.out.println(generateString(10));
        System.out.println(getRandomEmail());
        System.out.println(getRandomInt(11111111, 99999999));
        System.out.println(getRandomPhone());
        System.out.println(getRandomItemFromArray(genders));
        System.out.println(getRandomMonth());
        System.out.println(getRandomYear());
        System.out.println(getRandomDay());
        System.out.println(randomSubjectEnums());
        System.out.println(randomHobbiesEnums());
        System.out.println(randomMonthsEnums());
        System.out.println(randomStatesEnums());
    }


    private static <T> T getRandomValueFromArray(T[] array) {
        return array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];
    }

    public static String generateString(int len) {

        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();

        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();

    }

    public static String getRandomEmail() {

        return generateString(10) + "@ya.ru";
    }

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomPhone() {

        return "79" + getRandomInt(11, 99) + "" + getRandomInt(1111111, 9999999);
    }

    public static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length - 1);

        return values[index];
    }

    public static String getRandomGender() {

       return getRandomItemFromArray(genders);

    }
    public static String getRandomMonth() {
        return getRandomItemFromArray(months);
    }

    public static String getRandomYear() {
        return Integer.toString(getRandomInt(1900, 2100));
    }

    public static String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }
    public static String getRandomSubject() {

        return getRandomValueFromArray(subject);
    }

    public static String getRandomHobbies() {

        return getRandomItemFromArray(hobbies);

    }
    public static String getRandomCity() {
        switch (state) {
            case "NCR": {
                return  String.valueOf(getRandomCitiesNCR());
            }
           case "Uttar Pradesh": {
                return String.valueOf(getRandomCitiesUttarPradesh());
            }
            case "Haryana": {
                return String.valueOf(getRandomCitiesHaryana());
            }
            case "Rajasthan": {
                return String.valueOf(getRandomCitiesRajasthan());
            }
        }
        return null;
    }

}
