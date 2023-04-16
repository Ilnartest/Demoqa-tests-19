package com.demoqa.tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/text-box");

        $("#userName").setValue("VOVA");
        $("#userEmail").setValue("VOVA@PUTIN.RU");
        $("#currentAddress").setValue("str.Moskow-1");
        $("#permanentAddress").setValue("str.Kremlin-1");
        $("#submit").click();


        $("#output").should(text("VOVA"),text("VOVA@PUTIN.RU"),
                text("str.Moskow-1"),text("str.Kremlin-1"));
    }
}
