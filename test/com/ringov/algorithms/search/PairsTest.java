package com.ringov.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 16.07.17.
 */
public class PairsTest {
    @Test
    public void testcase0() throws Exception {
        int n = 5;
        int k = 2;
        int[] array = {1, 5, 3, 4, 2};

        int result = Pairs.solve(array, k);
        assertTrue(result == 3);
    }

}