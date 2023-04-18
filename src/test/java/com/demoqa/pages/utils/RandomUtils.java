package com.demoqa.pages.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.time.chrono.Chronology;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;



public class RandomUtils {
    public static final Faker autogenEn = new Faker(new Locale("en"));

    static String [] genders={"Male","Female","Other"};
    static String[] hobbies = {"Sports", "Reading", "Music"} ;

    public static void main(String[] args) {
        System.out.println(generateUuidString());
        System.out.println(generateString(10));
        System.out.println(getRandomEmail());
        System.out.println(getRandomInt(11111111,99999999));
        System.out.println(getRandomPhone ());
        System.out.println (getRandomItemFromArray(genders));
}

    public static String generateUuidString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
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
    public static int getRandomInt (int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static String getRandomPhone () {

        return "79" + getRandomInt(11, 99) + "" + getRandomInt(1111111, 9999999);
    }
    public  static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length - 1);

        return values[index];
    }
    public static String getRandomGender() {

        return getRandomItemFromArray(genders);
    }
    public static Calendar getDateOfBirth() {
        GregorianCalendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(autogenEn.date().birthday(10, 120));

        return dateOfBirth;
    }
    public static String getRandomHobbies() {

        return getRandomItemFromArray(hobbies);
    }

}


