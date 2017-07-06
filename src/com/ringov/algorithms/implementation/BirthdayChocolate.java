package com.ringov.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar
 * <p>
 * Created by ringov on 06.07.17.
 */
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int j = i;
            while (j < n && j - i < m) {
                sum += s[j];
                j++;
            }
            if (sum == d) {
                counter++;
            }
        }
        return counter;
    }

}
