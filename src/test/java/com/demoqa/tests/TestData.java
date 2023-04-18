package com.demoqa.tests;

import com.github.javafaker.Faker;
import static com.demoqa.pages.utils.RandomUtils.*;

public class TestData {
    static Faker faker = new Faker();
   public static
   String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = getRandomEmail(),
            gender = getRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = getRandomDay(),
            month = getRandomMonth(),
            year = getRandomYear(),
            subjects=getRandomSubject(),
            hobbies =getRandomHobbies(),
            picture="image.jpg",
            currentAddress = faker.address().streetAddress(),
            state=getRandomState(),
            city =getRandomCity();

}
