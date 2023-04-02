package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationForm extends TestBase {
    @Test
    void successfulFillFormTest() {
        open("/automation-practice-form");
        executeJavaScript ("$('#fixedban').remove()");
        executeJavaScript ("$ ('footer').remove ()");

        $("#firstName").setValue("Ilnar");
        $("#lastName").setValue("Kadyyrov");
        $("#userEmail").setValue("kadyyr@ya.ru");
        $("#genterWrapper").$(byText("Male")).click();;
        $("#userNumber").setValue("8900999999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1987");
        $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__day--014").click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFromClasspath("image.jpg");
        $("#currentAddress").setValue("str.Moscow-1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ilnar"), text("Kadyyrov"),
                text("kadyyr@ya.ru"), text("8900999999"));

    }
}

