package com.ringov.algorithms.sorting;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 * <p>
 * Created by ringov on 16.07.17.
 */
public class InsertionSortPart2Test {
    @Test
    public void testcase0() throws Exception {
        int n = 6;
        int[] array = {1, 4, 3, 5, 6, 2};

        String[] expectedResult = {
                "1 4 3 5 6 2",
                "1 3 4 5 6 2",
                "1 3 4 5 6 2",
                "1 3 4 5 6 2",
                "1 2 3 4 5 6"};

        List<String> result = InsertionSortPart2.solve(n, array);
        for (int i = 0; i < expectedResult.length; i++) {
            assertTrue(expectedResult[i].equals(result.get(i)));
        }
    }

}