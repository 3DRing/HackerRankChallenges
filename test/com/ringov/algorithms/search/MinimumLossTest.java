package com.ringov.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/minimum-loss
 *
 * Created by ringov on 15.07.17.
 */
public class MinimumLossTest {
    @Test
    public void testcase0() throws Exception {
        int n = 3;
        long[] prices = {5, 10, 3};
        long result = MinimumLoss.solve(n, prices);
        assertTrue(result == 2);
    }

    @Test
    public void testcase1() throws Exception {
        int n = 5;
        long[] prices = {20, 7, 8, 2, 5};
        long result = MinimumLoss.solve(n, prices);
        assertTrue(result == 2);
    }

}