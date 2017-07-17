package com.ringov.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 * <p>
 * Created by ringov on 17.07.17.
 */
public class Quicksort2Sorting {

    private static int[][] result;

    private static List<Integer> sortPartition(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        }
        int p = array.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            int crt = array.get(i);
            if (crt < p) {
                left.add(crt);
            } else if (crt > p) {
                right.add(crt);
            } else {
                equals.add(crt);
            }
        }
        left = sortPartition(left);
        right = sortPartition(right);

        left.addAll(equals);
        left.addAll(right);
        for (int i = 0; i < left.size(); i++) {
            if (i < left.size() - 1) {
                System.out.print(left.get(i) + " ");
            } else {
                System.out.println(left.get(i));
            }
        }

        return left;
    }

    public static int[][] solve(Integer[] array) {
        List<Integer> ar = Arrays.asList(array);

        List<Integer> result = sortPartition(ar);

        // no tests provided :(
        return new int[1][1];
    }
}
