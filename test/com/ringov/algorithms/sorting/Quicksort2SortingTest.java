package com.ringov.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 * <p>
 * Created by ringov on 17.07.17.
 */
public class Quicksort2SortingTest {
    @Test
    public void testcase0() throws Exception {
        int n = 7;
        Integer[] array = {5, 8, 1, 3, 7, 9, 2};

        int[][] expectedResult = {
                {2, 3},
                {1, 2, 3},
                {7, 8, 9},
                {1, 2, 3, 5, 7, 8, 9}};

        int[][] result = Quicksort2Sorting.solve(array);
        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < expectedResult[i].length; j++) {
                // no correct result format provided :(
                //assertTrue(expectedResult[i][j] == result[i][j]);
            }
        }
    }

}