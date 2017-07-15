package com.ringov.algorithms.sorting;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ringov on 15.07.17.
 */
public class InsertionSortPart1Test {
    @Test
    public void testcase0() throws Exception {
        int n = 5;
        int[] array = {2, 4, 6, 8, 3};

        String[] expectedResult = {
                "2 4 6 8 8",
                "2 4 6 6 8",
                "2 4 4 6 8",
                "2 3 4 6 8"
        };
        List<String> result = InsertionSortPart1.solve(array);
        for (int i = 0; i < result.size(); i++) {
            assertTrue(result.get(i).equals(expectedResult[i]));
        }
    }

}