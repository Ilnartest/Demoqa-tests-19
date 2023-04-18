package com.demoqa.tests;

import org.junit.jupiter.api.Test;


import static com.demoqa.tests.TestData.*;

public class StudentRegistrationFormWithRandomUtilsAndFaker extends TestBase {


    @Test
    void successfulFillFormTest() {

        registrationPage.openPage()

                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthDate("14","6","1987")
                .setHobbies(hobbies)
                .setHobbiesCheckbox()
                .setPicture(picture)
                .setCurrentAddress("str.Moscow-1")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit()

                .verifyRegistrationResultsModalAppears()
                .verifyResult("Student Name", firstName+" "+lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Mobile", userNumber);

    }
}

