package com.ringov.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/big-sorting
 * <p>
 * Created by ringov on 15.07.17.
 */
public class BigSortingTest {
    @Test
    public void testcase0() throws Exception {
        String[] array = {"6", "31415926535897932384626433832795", "1", "3", "10", "3", "5"};

        String[] expectedResult = {"1", "3", "3", "5", "6", "10", "31415926535897932384626433832795"};

        String[] result = BigSorting.solve(array);
        for (int i = 0; i < expectedResult.length; i++) {
            assertTrue(result[i].equals(expectedResult[i]));
        }
    }

}