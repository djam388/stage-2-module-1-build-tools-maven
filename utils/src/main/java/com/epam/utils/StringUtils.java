package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean isPositive = false;
        try {
            if (str.matches("\\d*.\\d*")
                    && !str.equals(" ")
                    && Double.parseDouble(str) > 0
                    && !str.startsWith("0")) {
                isPositive = true;
            }
        } catch (NullPointerException e) {
            return false;
        }

        return isPositive;
    }
}
