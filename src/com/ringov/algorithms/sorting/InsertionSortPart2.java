package com.ringov.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 * <p>
 * Created by ringov on 16.07.17.
 */
public class InsertionSortPart2 {

    public static List<String> solve(int n, int[] array) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < array.length; k++) {
                if (k < array.length - 1) {
                    sb.append(array[k]).append(" ");
                } else {
                    sb.append(array[k]);
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

}
