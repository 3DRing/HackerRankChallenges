package com.ringov.algorithms.search;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/playing-with-numbers
 * <p>
 * Created by ringov on 17.07.17.
 */
public class AbsoluteElementSums {
    public static int[] solve(int n, int[] array, int q, int[] queries) {
        return naiveSolution2(array, queries);
    }

    private static int[] finalSolution(int[] array, int[] queries) {
        Arrays.sort(array);

        int[] abs = new int[array.length];
        abs[0] = Math.abs(array[0]);
        int changeSignIndex = 0;
        int absGreaterThanQueryIndex = 0;
        for (int i = 1; i < abs.length; i++) {
            if (array[changeSignIndex] >= 0) {
                changeSignIndex = i;
            }
            if (Math.abs(array[absGreaterThanQueryIndex]) >= Math.abs(queries[0])) {
                absGreaterThanQueryIndex = i;
            }
            abs[i] = abs[i - 1] + Math.abs(array[i]);
        }

        int[] result = new int[queries.length];
        int querySum = 0;
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            querySum += q;

            if (changeSignIndex < absGreaterThanQueryIndex) { // then q > 0
                int updateSum = 0;
                if (absGreaterThanQueryIndex != 0) {
                    abs[absGreaterThanQueryIndex - 1] = Math.abs(q) * absGreaterThanQueryIndex;
                    updateSum += abs[absGreaterThanQueryIndex - 1];
                }
                for (int j = absGreaterThanQueryIndex; j < changeSignIndex; j++) {
                    int newArrayValue = array[j] + querySum;

                    if (newArrayValue < 0) {
                        changeSignIndex = j + 1;
                    }
                    abs[j] = updateSum + newArrayValue;
                }
                for (int j = 0; j < changeSignIndex; j++) {
                    int newArrayValue = array[j] + querySum;
                    if (i < queries.length - 1 && Math.abs(newArrayValue) >= Math.abs(queries[i + 1])) {
                        absGreaterThanQueryIndex = j + 1;
                        break;
                    }
                }
                result[i] = abs[changeSignIndex - 1] + Math.abs(q) * (abs.length - changeSignIndex);
            } else {    // q < 0
                int updateSum = 0;
                if (changeSignIndex != 0) {
                    abs[changeSignIndex - 1] += Math.abs(q) * changeSignIndex;
                    updateSum += abs[changeSignIndex - 1];
                }
                for (int j = changeSignIndex; j < absGreaterThanQueryIndex; j++) {
                    int newArrayValue = array[j] + querySum;
                    if (i < queries.length - 1 && Math.abs(newArrayValue) >= Math.abs(queries[i + 1])) {
                        absGreaterThanQueryIndex = j + 1;
                    }
                    abs[j] = updateSum + newArrayValue;
                }
                for (int j = 0; j < absGreaterThanQueryIndex; j++) {
                    int newArrayValue = array[j] + querySum;
                    if (newArrayValue < 0) {
                        changeSignIndex = j + 1;
                        break;
                    }
                }
                result[i] = abs[absGreaterThanQueryIndex - 1] + Math.abs(q) * (abs.length - absGreaterThanQueryIndex);
            }
        }
        return result;
    }

    private static int[] naiveSolution(int[] array, int[] queries) {
        Arrays.sort(array);

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                array[j] += queries[i];
                sum += Math.abs(array[j]);
            }
            result[i] = sum;
        }
        return result;
    }

    private static int[] naiveSolution2(int[] array, int[] queries) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                int lastValue = map.get(array[i]);
                map.put(array[i], lastValue + 1);
            }
        }

        int qSum = 0;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            qSum += queries[i];
            int sum = 0;
            Iterator<Integer> keys = map.keySet().iterator();
            int totalSum = 0;
            while (keys.hasNext()) {
                int key = keys.next();
                int count = map.get(key);
                int localSum = (key + qSum) * count;
                totalSum += Math.abs(localSum);
            }

            result[i] = totalSum;
        }
        return result;
    }
}
