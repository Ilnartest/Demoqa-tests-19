package com.demoqa.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.demoqa.pages.utils.RandomUtils.*;
import static com.demoqa.pages.utils.RandomUtils.getRandomGender;

public class StudentRegistrationFormWithFaker extends TestBase {
    @Test
    void successfulFillFormTest() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                userEmail = faker.internet().emailAddress(),
                currentAddress=faker.address().streetAddress(),
                userNumber=faker.phoneNumber().subscriberNumber(10);

        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$ ('footer').remove ()");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $("#genterWrapper").$(byText(getRandomGender())).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1987");
        $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__day--014").click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFromClasspath("image.jpg");
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(userEmail));

    }
}
