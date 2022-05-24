package com.sigulia.utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import static java.lang.String.format;

public class GenerateFakerData {
    Faker faker = new Faker();

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            mobileNumber = faker.phoneNumber().subscriberNumber(10),
            expectedFullName = format("" + firstName + " " + lastName + "");

    // Create random string
    public String generatedString() {
        int length = 6;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;
    }

}
