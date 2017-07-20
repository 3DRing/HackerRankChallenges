package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string
 * <p>
 * Created by ringov on 20.07.17.
 */
public class HackerRankInAString {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String solve(String s) {
        String hack = "hackerrank";
        int pointer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hack.charAt(pointer)) {
                pointer++;
                if (pointer == hack.length()) {
                    break;
                }
            }
        }
        return pointer == hack.length() ? YES : NO;
    }

}
