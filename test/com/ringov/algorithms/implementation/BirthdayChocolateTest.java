package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar
 * <p>
 * Created by ringov on 06.07.17.
 */
public class BirthdayChocolateTest {

    @Test
    public void solveT0() throws Exception {
        int n = 3;
        int[] s = {1, 2, 1, 3, 2};
        int d = 3;
        int m = 2;

        int output = BirthdayChocolate.solve(n, s, d, m);
        assertTrue(output == 2);
    }

    @Test
    public void solveT1() throws Exception {
        int n = 6;
        int[] s = {1, 1, 1, 1, 1, 1};
        int d = 3;
        int m = 2;

        int output = BirthdayChocolate.solve(n, s, d, m);
        assertTrue(output == 0);
    }

    @Test
    public void solveT2() throws Exception {
        int n = 1;
        int[] s = {4};
        int d = 4;
        int m = 1;

        int output = BirthdayChocolate.solve(n, s, d, m);
        assertTrue(output == 1);
    }

}