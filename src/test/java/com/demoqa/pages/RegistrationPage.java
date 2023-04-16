package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
  CalendarComponent calendarComponent = new CalendarComponent();
  ResultsModal resultsModal = new ResultsModal();

  SelenideElement
          formHeaderText = $(".practice-form-wrapper"),
          firstNameInput = $("#firstName"),
          lastNameInput = $("#lastName"),
          userEmailInput = $("#userEmail"),
          gender = $("#genterWrapper"),
          userNumber = $("#userNumber"),
          dateOfBirthInput = $("#dateOfBirthInput"),
          hobbies = $("#hobbiesWrapper"),
          hobbiesCheckbox = $("#hobbies-checkbox-1"),
          picture = $("#uploadPicture"),
          currentAddress = $("#currentAddress"),
          state = $("#state"),
          stateCity = $("#stateCity-wrapper"),
          city = $("#city"),
          stateCity1 = $("#stateCity-wrapper"),
          submit = $("#submit");

  public RegistrationPage setFirstName(String value) {
    firstNameInput.setValue(value);

    return this;
  }
  public RegistrationPage openPage() {
    open("/automation-practice-form");
    formHeaderText.shouldHave(text("Student Registration Form"));
    executeJavaScript("$('#fixedban').remove()");
    executeJavaScript("$ ('footer').remove ()");

    return this;
  }
  public RegistrationPage setLastName(String value) {
    lastNameInput.setValue(value);

    return this;
  }
  public RegistrationPage setUserEmail(String value) {
    userEmailInput.setValue(value);

    return this;
  }
  public RegistrationPage setGender(String value) {
    gender.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setUserNumber(String value) {
    userNumber.setValue(value);

    return this;
  }

  public RegistrationPage setBirthDate(String day, String month, String year) {
    dateOfBirthInput.click();
    calendarComponent.setDate(day, month, year);

    return this;
  }

  public RegistrationPage setHobbies(String value) {
    hobbies.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setHobbiesCheckbox() {
    hobbiesCheckbox.parent().click();

    return this;
  }

  public RegistrationPage setPicture(String picturePath) {
    picture.uploadFromClasspath(picturePath);

    return this;
  }

  public RegistrationPage setCurrentAddress(String value) {
    currentAddress.setValue(value);

    return this;
  }

  public RegistrationPage setState() {
    state.click();
    return this;
  }

  public RegistrationPage setStateCity(String value) {
    stateCity.$(byText(value)).click();

    return this;
  }
  public RegistrationPage setCity() {
    city.click();

    return this;
  }
  public RegistrationPage setStateCity1(String value) {
    stateCity1.$(byText(value)).click();

    return this;
  }
  public RegistrationPage setSubmit() {
    submit.click();

    return this;
  }
  public RegistrationPage verifyRegistrationResultsModalAppears() {
    resultsModal.verifyModalAppears();

    return this;
  }
  public RegistrationPage verifyResult(String key, String value) {
    resultsModal.verifyResult(key, value);

    return this;
  }
}