package com.demoqa.tests;

import com.github.javafaker.Faker;

import static com.demoqa.enums.GendersEnums.randomGendersEnums;
import static com.demoqa.enums.HobbiesEnums.randomHobbiesEnums;
import static com.demoqa.enums.MonthsEnums.randomMonthsEnums;
import static com.demoqa.enums.StatesEnums.randomStatesEnums;
import static com.demoqa.enums.SubjectEnums.randomSubjectEnums;
import static com.demoqa.utils.RandomUtils.*;


public class TestData {
    static Faker faker = new Faker();
   public static
   String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = getRandomEmail(),

    // gender = faker.options().option("Male", "Female", "Other"),
            gender = String.valueOf(randomGendersEnums()),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = getRandomDay(),
            month = String.valueOf(randomMonthsEnums()),
            year = getRandomYear(),
            subjects= String.valueOf(randomSubjectEnums()),
            hobbies =String.valueOf(randomHobbiesEnums()),
            picture="image.jpg",
            currentAddress = faker.address().streetAddress(),
            state=String.valueOf(randomStatesEnums()),
            city =String.valueOf(getRandomCity());

}
