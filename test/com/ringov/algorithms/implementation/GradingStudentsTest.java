package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/grading
 *
 * Created by ringov on 06.07.17.
 */
public class GradingStudentsTest {
    @Test
    public void solveT1() throws Exception {
        int[] input = {73, 67, 38, 33};
        int[] output = GradingStudents.solve(input);


        int[] expectedResult = {75, 67, 40, 33};
        for (int i = 0; i < output.length; i++) {
            assertTrue(output[i] == expectedResult[i]);
        }
    }

}