package com.ringov.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 17.07.17.
 */
public class AbsoluteElementSumsTest {
    @Test
    public void testcase0() throws Exception {
        int n = 3;
        int[] array = {-1, 2, -3};
        int q = 3;
        int[] queries = {1, -2, 3};

        int[] result = AbsoluteElementSums.solve(n, array, q, queries);
        int[] expectedResult = {5, 7, 6};

        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] == expectedResult[i]);
        }
    }

    @Test
    public void testcase1() throws Exception {
        int n = 4;
        int[] array = {-1, 2, -3, 2};
        int q = 3;
        int[] queries = {1, -2, 3};

        int[] result = AbsoluteElementSums.solve(n, array, q, queries);
        int[] expectedResult = {8, 8, 10};

        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] == expectedResult[i]);
        }
    }

}