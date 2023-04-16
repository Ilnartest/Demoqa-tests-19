package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormWithPageObjects extends TestBase {

    @Test
    void successfulFillFormTest() {
        registrationPage.openPage()

                        .setFirstName("Ilnar")
                        .setLastName("Kadyyrov")
                        .setUserEmail("kadyyr@ya.ru")
                        .setGender("Male")
                        .setUserNumber("8900999999")
                        .setBirthDate("14","6","1987")
                        .setHobbies("Sports")
                        .setHobbiesCheckbox()
                        .setPicture("image.jpg")
                        .setCurrentAddress("str.Moscow-1")
                        .setState()
                        .setStateCity("NCR")
                        .setCity()
                        .setStateCity1("Delhi")
                        .setSubmit()

                        .verifyRegistrationResultsModalAppears()
                        .verifyResult("Student Name", "Ilnar Kadyyrov")
                        .verifyResult("Student Email", "kadyyr@ya.ru")
                        .verifyResult("Mobile", "8900999999");

    }
}
