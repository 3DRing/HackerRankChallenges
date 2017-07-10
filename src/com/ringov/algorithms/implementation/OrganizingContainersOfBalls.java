package com.ringov.algorithms.implementation;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls
 * <p>
 * Created by ringov on 10.07.17.
 */
public class OrganizingContainersOfBalls {

    public static final String POSSIBLE = "Possible";
    public static final String IMPOSSIBLE = "Impossible";

    public static String solve(int n, int[][] m) {
        return oneSolution(n, m);
    }

    private static boolean matrixOrganizationPossible(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            int sumCol = 0;
            int sumRow = 0;
            for (int j = 0; j < m.length; j++) {
                sumCol += m[i][j];
                sumRow += m[j][i];
                if (sumCol != sumRow) {
                    return false;
                }
                if (sum == 0) {
                    sum = sumCol;
                } else if (sum != sumRow || sum != sumCol) {
                    return false;
                }
            }
        }
        return true;
    }
/*
    private static String sol(int n, int[][] m) {

    }*/

    public static String oneSolution(int n, int[][] m) {
        HashMap<Integer, Integer> buckets = new HashMap<>();
        HashMap<Integer, Integer> ballsTypes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int bucketAmount = 0;
            int typeAmount = 0;
            for (int j = 0; j < n; j++) {
                bucketAmount += m[i][j];
                typeAmount += m[j][i];
            }
            Integer lastAmount = buckets.get(bucketAmount);
            if (lastAmount != null) {
                lastAmount++;
            } else {
                lastAmount = 1;
            }
            buckets.put(bucketAmount, lastAmount);

            lastAmount = ballsTypes.get(typeAmount);
            if (lastAmount != null) {
                lastAmount++;
            } else {
                lastAmount = 1;
            }
            ballsTypes.put(typeAmount, lastAmount);
        }

        for (Integer crtValue : buckets.keySet()) {
            if (ballsTypes.get(crtValue) == null || !ballsTypes.get(crtValue).equals(buckets.get(crtValue))) {
                return IMPOSSIBLE;
            }
        }
        return POSSIBLE;
    }

}
