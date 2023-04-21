package com.demoqa.enums;

import java.util.Random;

public enum SubjectEnums {
    Hindi, English, Maths, Physics, Chemistry, Biology,
    Computer, Commerce, Accounting, Economics, Arts,
    Social, History, Civics;

    private static final Random r = new Random();

    public static SubjectEnums randomSubjectEnums()  {
        SubjectEnums[] subjectEnums = values();

        return subjectEnums[r.nextInt(subjectEnums.length)];
    }
}

