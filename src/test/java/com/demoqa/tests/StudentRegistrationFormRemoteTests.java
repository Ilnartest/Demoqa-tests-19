package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.demoqa.tests.TestData.*;
import static io.qameta.allure.Allure.step;

public class StudentRegistrationFormRemoteTests extends RemoteTestBase {

    @Test
    @Tag("remote")
    @DisplayName("Successful registration")
    void successfulFillFormTest() {
    step("Open form", () -> {
    registrationPage.openPage()
                    .removeBanner();
    });
    step("Fill form", () -> {
    registrationPage.setFirstName(firstName)
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
                    .clickSubmit();
    });
    step("Verify results", () -> {
    registrationPage.verifyRegistrationResultsModalAppears()
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
    });
    }
}


