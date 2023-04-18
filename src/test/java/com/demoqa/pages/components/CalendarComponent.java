package com.demoqa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate (String day, String month,String year) {

        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOption(month);
        String dayPickerLocator = String.format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day);
        $(dayPickerLocator).click();
    }
}
