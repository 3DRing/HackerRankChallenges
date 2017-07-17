package com.ringov.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/quicksort1
 * <p>
 * Created by ringov on 17.07.17.
 */
public class Quicksort1Partition {

    public static Integer[] solve(int[] array, int p) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < p) {
                left.add(array[i]);
            } else if (array[i] > p) {
                right.add(array[i]);
            } else {
                equals.add(array[i]);
            }
        }
        left.addAll(equals);
        left.addAll(right);
        return left.toArray(new Integer[left.size()]);
    }

}
