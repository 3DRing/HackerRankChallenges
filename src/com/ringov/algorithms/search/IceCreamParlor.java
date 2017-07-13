package com.ringov.algorithms.search;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 * <p>
 * Created by ringov on 13.07.17.
 */
public class IceCreamParlor {

    public static int[] solve(int m, int n, int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= m) {
                continue;
            }
            List<Integer> values = map.get(arr[i]);
            if (values != null) {
                values.add(i);
            } else {
                values = new ArrayList<>();
                values.add(i);
                map.put(arr[i], values);
            }
        }

        for (int i = 0; i < arr.length; i++) {

            int remainder = m - arr[i];
            List<Integer> opposite = map.get(remainder);
            if (opposite != null) {
                Integer max = Collections.max(opposite);
                if (i < max) {
                    return new int[]{i + 1, max + 1};
                }
            }
        }
        return null;
    }
}
