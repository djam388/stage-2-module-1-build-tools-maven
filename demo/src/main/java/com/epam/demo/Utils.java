package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = true;
        for (String arg : args) {

            if (!StringUtils.isPositiveNumber(arg)) {
                isAllPositive = false;
            }
        }
        return isAllPositive;
    }
}