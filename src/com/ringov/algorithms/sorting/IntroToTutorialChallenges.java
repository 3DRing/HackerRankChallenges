package com.ringov.algorithms.sorting;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 * <p>
 * Created by ringov on 15.07.17.
 */
public class IntroToTutorialChallenges {

    public static int solve(int n, int[] array, int V) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            if (array[middle] == V) {
                return middle;
            } else if (array[middle] < V) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        return -1;
    }

}
