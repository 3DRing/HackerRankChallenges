package com.ringov.algorithms.implementation;


/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer
 *
 * Created by ringov on 06.07.17.
 */
public class DayOfTheProgrammer {

    private static boolean isLeapJulianYear(int year) {
        return year % 4 == 0;
    }

    private static boolean isLeapGregorian(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    public static String solve(int year) {
        if (year == 1918) {
            return "26.09.1918";
        }
        if (year >= 1700 && year <= 1917) {
            if (isLeapJulianYear(year)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else {
            if (isLeapGregorian(year)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }

}
