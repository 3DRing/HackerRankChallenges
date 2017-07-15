package com.ringov.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/insertionsort1?h_r=next-challenge&h_v=zen
 * <p>
 * Created by ringov on 15.07.17.
 */
public class InsertionSortPart1 {

    public static List<String> solve(int[] array) {
        List<String> results = new ArrayList<>();
        int inserted = array[array.length - 1];
        int i = array.length - 2;
        while (i >= 0 && array[i] > inserted) {
            array[i + 1] = array[i];
            i--;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < array.length; j++) {
                if (j < array.length - 1) {
                    sb.append(array[j]).append(" ");
                } else {
                    sb.append(array[j]);
                }
            }
            results.add(sb.toString());
        }
        array[i + 1] = inserted;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < array.length; j++) {
            if (j < array.length - 1) {
                sb.append(array[j]).append(" ");
            } else {
                sb.append(array[j]);
            }
        }
        results.add(sb.toString());
        return results;
    }
}
