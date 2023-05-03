package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class RemoteTestBase {
    RegistrationPage registrationPage =new RegistrationPage();
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl= "https://demoqa.com";
        Configuration.browserSize= "1920x1080";
    }
}
