package com.ringov.algorithms.sorting;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/big-sorting
 * <p>
 * Created by ringov on 15.07.17.
 */
public class BigSorting {

    public static String[] solve(String[] array) {
        return finalSolution(array);
    }

    public static String[] naiveSolution(String[] array) {
        BigInteger[] integers = new BigInteger[array.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = new BigInteger(array[i]);
        }
        Arrays.sort(integers);
        for (int i = 0; i < integers.length; i++) {
            array[i] = integers[i].toString();
        }
        return array;
    }

    public static String[] finalSolution(String[] array) {
        Arrays.sort(array, (s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    int i1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
                    int i2 = Integer.parseInt(String.valueOf(s2.charAt(i)));
                    if (i1 < i2) {
                        return -1;
                    } else if (i1 > i2) {
                        return 1;
                    }
                }
                return 0;
            }
        });
        return array;
    }
}
