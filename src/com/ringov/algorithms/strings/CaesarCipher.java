package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1
 * <p>
 * Created by ringov on 19.07.17.
 */
public class CaesarCipher {

    private static char shiftFrom(char ch, int k, char fromChar) {
        return (char) ((((ch - fromChar) + k) % 26) + fromChar);
    }

    public static char shiftLower(char ch, int k) {
        return shiftFrom(ch, k, 'a');
    }

    public static char shiftUpper(char ch, int k) {
        return shiftFrom(ch, k, 'A');
    }

    public static boolean isAlphabetic(char ch) {
        return ((int) ch >= 'a' && (int) ch <= 'z') || ((int) ch >= 'A' && (int) ch <= 'Z');
    }

    public static String solve(String str, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isAlphabetic(ch)) {
                ch = Character.isLowerCase(ch) ? shiftLower(ch, k) : shiftUpper(ch, k);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
