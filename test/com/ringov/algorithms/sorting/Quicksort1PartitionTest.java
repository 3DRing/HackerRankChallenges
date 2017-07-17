package com.ringov.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/quicksort1
 *
 * Created by ringov on 17.07.17.
 */
public class Quicksort1PartitionTest {
    @Test
    public void testcase0() throws Exception {
        int n = 5;
        int p = 4;
        int[] arr = {4, 5, 3, 7, 2};

        int[] expectedResult = {3, 2, 4, 5, 7};
        Integer[] result = Quicksort1Partition.solve(arr, p);

        for (int i = 0; i < result.length; i++) {
            assertTrue(expectedResult[i] == result[i]);
        }
    }

}