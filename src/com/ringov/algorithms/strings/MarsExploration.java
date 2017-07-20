package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/mars-exploration
 * <p>
 * Created by ringov on 20.07.17.
 */
public class MarsExploration {

    private static char charExpectedLetter(int i) {
        int a = i % 3;
        switch (a) {
            case 0:
                return 'S';
            case 1:
                return 'O';
            case 2:
                return 'S';
            default:
                return 'o';
        }
    }

    public static int solve(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (charExpectedLetter(i) != s.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
