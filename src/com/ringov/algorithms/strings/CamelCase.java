package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/camelcase
 * <p>
 * Created by ringov on 19.07.17.
 */
public class CamelCase {
    public static int solve(String str) {
        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}
