package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 * <p>
 * Created by ringov on 19.07.17.
 */
public class SuperReducedString {

    public static final String EMPTY_STRING = "Empty String";

    public static String solve(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                str = str.substring(0, i - 1) + str.substring(i + 1);
                i = 0;
            }
        }
        return str.length() != 0 ? str : EMPTY_STRING;
    }

}
