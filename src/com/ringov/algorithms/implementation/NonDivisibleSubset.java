package com.ringov.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset
 * <p>
 * Created by ringov on 10.07.17.
 */
public class NonDivisibleSubset {

    public static int solve(int n, int k, int[] arr) {
        int[] values = new int[k];
        for (int i = 0; i < n; i++) {
            int remainder = arr[i] % k;
            values[remainder]++;
        }

        int max = 0;
        if (values[0] != 0) {
            max += 1;
        }
        for (int i = 1; i <= values.length / 2; i++) {
            if (2 * i == k) {
                if (values[i] != 0) {
                    max += 1;
                }
                continue;
            }
            if (values[i] > values[values.length - 1 - (i - 1)]) {
                max += values[i];
            } else {
                max += values[values.length - 1 - (i - 1)];
            }
        }
        return max;
    }
}
