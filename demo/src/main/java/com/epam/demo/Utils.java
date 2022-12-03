package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isPositiveNumberFound = true;
        for (String arg : args) {
            isPositiveNumberFound = StringUtils.isPositiveNumber(arg);
            if (!isPositiveNumberFound) {
                isPositiveNumberFound = false;
                break;
            }
        }
        return isPositiveNumberFound;
    }
}