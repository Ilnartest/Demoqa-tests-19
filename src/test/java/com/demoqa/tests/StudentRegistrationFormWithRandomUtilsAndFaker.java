package com.demoqa.tests;

import org.junit.jupiter.api.Test;
import static com.demoqa.tests.TestData.*;

public class StudentRegistrationFormWithRandomUtilsAndFaker extends TestBase {

    @Test
    void successfulFillFormTest() {

    registrationPage.openPage()
                    .removeBanner()
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setUserEmail(userEmail)
                    .setGender(gender)
                    .setUserNumber(userNumber)
                    .setBirthDate(day,month,year)
                    .setSubjects(subjects)
                    .setHobbies(hobbies)
                    .setPicture(picture)
                    .setCurrentAddress(currentAddress)
                    .setState(state)
                    .setCity(city)
                    .clickSubmit()

                .verifyRegistrationResultsModalAppears()
                .verifyResult("Student Name", firstName+" "+lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", userNumber)
                .verifyResult("Date of Birth", day +" "+ month +","+ year)
                .verifyResult("Subjects", subjects)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", picture)
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City",state);

    }
}


