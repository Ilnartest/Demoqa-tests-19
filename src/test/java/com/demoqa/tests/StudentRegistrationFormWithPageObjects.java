package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormWithPageObjects extends TestBase {

    @Test
    void successfulFillFormTest() {
        registrationPage.openPage()
                        .removeBanner()
                        .setFirstName("Ilnar")
                        .setLastName("Kadyyrov")
                        .setUserEmail("kadyyr@ya.ru")
                        .setGender("Male")
                        .setUserNumber("8900999999")
                        .setBirthDate("14","6","1987")
                        .setSubjects("Math")
                        .setHobbies("Sports")
                        .setPicture("image.jpg")
                        .setCurrentAddress("str.Moscow-1")
                        .setState("NCR")
                        .setCity("Delhi")
                        .clickSubmit()

                        .verifyRegistrationResultsModalAppears()
                        .verifyResult("Student Name", "Ilnar Kadyyrov")
                        .verifyResult("Student Email", "kadyyr@ya.ru")
                        .verifyResult("Gender", "Male")
                        .verifyResult("Mobile", "8900999999")
                        .verifyResult("Date of Birth", "14 July,1987")
                        .verifyResult("Subjects", "Math")
                        .verifyResult("Hobbies", "Sports")
                        .verifyResult("Picture", "image.jpg")
                        .verifyResult("Address", "str.Moscow-1")
                        .verifyResult("State and City", "NCR Delhi");

    }
}
