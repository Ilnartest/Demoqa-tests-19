package com.demoqa.enums;

import java.util.Random;

public enum HobbiesEnums {

   Sports, Reading, Music;

    private static final Random r = new Random();
    public static HobbiesEnums randomHobbiesEnums()  {
        HobbiesEnums[] hobbiesEnums = values();

        return hobbiesEnums[r.nextInt(hobbiesEnums.length)];
    }
}
