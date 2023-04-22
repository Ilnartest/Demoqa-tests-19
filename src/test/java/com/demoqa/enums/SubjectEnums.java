package com.demoqa.enums;

import java.util.Random;

public enum SubjectEnums {
    HINDI("Hindi"),ENGLISH("English"), MATHS("Maths"), PHYSICS("Physics"),
    CHEMISTRY("Chemistry"), BIOLOGY("Biology"), COMPUTER_SCIENCE("Computer Science"),
    COMMERCE("Commerce"), ACCOUNTING("Accounting"), ECONOMICS("Economics"),
    ARTS("Arts"), SOCIAL_STUDIES("Social Studies"), HISTORY("History"), CIVICS("Civics");

    private String name;
    SubjectEnums (String name) {

        this.name = name;
    }
    public String getName() {

        return name;
    }

    public static String randomSubjectEnums()  {
        Random r = new Random();
        SubjectEnums[] subjectEnums = values();

        return subjectEnums[r.nextInt(subjectEnums.length)].getName();
    }
}

