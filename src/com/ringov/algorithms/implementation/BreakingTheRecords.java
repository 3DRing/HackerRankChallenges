package com.ringov.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 * <p>
 * Created by ringov on 06.07.17.
 */
public class BreakingTheRecords {

    static int[] getRecord(int[] grades) {
        int[] result = new int[2];

        int best = grades[0];
        int bestCounter = 0;

        int worst = grades[0];
        int worstCounter = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > best) {
                bestCounter++;
                best = grades[i];
            }
            if (grades[i] < worst) {
                worstCounter++;
                worst = grades[i];
            }
        }

        result[0] = bestCounter;
        result[1] = worstCounter;

        return result;
    }

}
