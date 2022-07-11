package com.example.springstudy.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class BasedUtil {

    public static String generatedInvestUserId(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }

}
