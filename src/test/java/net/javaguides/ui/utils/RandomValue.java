package net.javaguides.ui.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValue {
    public static String newFirstName = RandomStringUtils.randomAlphabetic(3, 12);
    public static String newLastName = RandomStringUtils.randomAlphabetic(3, 12);
    public static String newEmail = RandomStringUtils.randomAlphabetic(3, 12) + "@gmail.com";

    public static final String updateNewFirstName = RandomStringUtils.randomAlphabetic(3, 12);
    public static final String updateNewLastName = RandomStringUtils.randomAlphabetic(3, 12);
    public static final String updateNewEmail = RandomStringUtils.randomAlphabetic(3, 12) + "@gmail.com";

}