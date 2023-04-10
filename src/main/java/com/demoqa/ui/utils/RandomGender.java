package com.demoqa.ui.utils;

import java.util.Random;

public class RandomGender {

    public String getGender() {
        String[] genders = {"female", "male", "other"};

        Random random = new Random();
        int index = random.nextInt(genders.length);

        String randomGender = genders[index];

        return randomGender;
    }
}

