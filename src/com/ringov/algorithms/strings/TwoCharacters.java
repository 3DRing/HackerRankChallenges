package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/two-characters
 * <p>
 * Created by ringov on 19.07.17.
 */
public class TwoCharacters {

    private static int charToInt(char ch) {
        return (int) Character.toLowerCase(ch) - (int) 'a';
    }

    private static char intToChar(int i) {
        return (char) ('a' + i);
    }

    public static int solve(String str) {
        int max = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                char crt = 0;
                int counter = 0;
                boolean fail = false;
                for (int k = 0; k < str.length(); k++) {
                    char crtChar = str.charAt(k);
                    if (crtChar == crt) {
                        fail = true;
                        break;
                    } else {
                        if (crtChar == intToChar(i)) {
                            crt = intToChar(i);
                            counter++;
                        } else if (crtChar == intToChar(j)) {
                            crt = intToChar(j);
                            counter++;
                        }
                    }
                }
                if (!fail) {
                    if (max < counter) {
                        max = counter;
                    }
                }
            }
        }
        return max < 2 ? 0 : max;
    }
}
