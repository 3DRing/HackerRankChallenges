package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 * <p>
 * Created by ringov on 06.07.17.
 */
public class BreakingTheRecordsTest {
    @Test
    public void solveT1() throws Exception {
        int[] input = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] output = BreakingTheRecords.getRecord(input);

        int[] expectedResult = {2, 4};
        assertTrue(output[0] == expectedResult[0]);
        assertTrue(output[1] == expectedResult[1]);
    }

    @Test
    public void solveT2() throws Exception {
        int[] input = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] output = BreakingTheRecords.getRecord(input);

        int[] expectedResult = {4, 0};
        assertTrue(output[0] == expectedResult[0]);
        assertTrue(output[1] == expectedResult[1]);
    }

}