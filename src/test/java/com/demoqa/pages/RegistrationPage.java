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
          genterWrapper = $("#genterWrapper"),
          userNumberInput = $("#userNumber"),
          dateOfBirthInput = $("#dateOfBirthInput"),
          subjectsInput = $("#subjectsInput"),
          hobbiesWrapper = $("#hobbiesWrapper"),
          hobbiesCheckbox = $("#hobbies-checkbox-1"),
          uploadPicture = $("#uploadPicture"),
          currentAddress = $("#currentAddress"),
          stateInput = $("#state"),
          cityInput = $("#city"),
          stateAndCity = $("#stateCity-wrapper"),
          submitButton = $("#submit");

  public RegistrationPage setFirstName(String value) {
    firstNameInput.setValue(value);

    return this;
  }
  public RegistrationPage openPage() {
    open("/automation-practice-form");
    formHeaderText.shouldHave(text("Student Registration Form"));

    return this;
  }
  public RegistrationPage removeBanner() {
    executeJavaScript("$('#fixedban').remove()");
    executeJavaScript("$('footer').remove()");

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
    genterWrapper.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setUserNumber(String value) {
    userNumberInput.setValue(value);

    return this;
  }

  public RegistrationPage setBirthDate(String day, String month, String year) {
    dateOfBirthInput.click();
    calendarComponent.setDate(day, month, year);

    return this;
  }
  public RegistrationPage setSubjects (String value) {
    subjectsInput.setValue(value).pressEnter();

    return this;
  }
  public RegistrationPage setHobbies (String value) {
    hobbiesWrapper.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setHobbiesCheckbox() {
    hobbiesCheckbox.parent().click();

    return this;
  }

  public RegistrationPage setPicture(String picturePath) {
    uploadPicture.uploadFromClasspath(picturePath);

    return this;
  }

  public RegistrationPage setCurrentAddress(String value) {
    currentAddress.setValue(value);

    return this;
  }

  public RegistrationPage setState(String value) {
    stateInput.click();
    stateAndCity.$(byText(value)).click();

    return this;
  }

  public RegistrationPage setCity(String value) {
    cityInput.click();
    stateAndCity.$(byText(value)).click();

    return this;
  }
  public RegistrationPage clickSubmit() {
    submitButton.click();

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