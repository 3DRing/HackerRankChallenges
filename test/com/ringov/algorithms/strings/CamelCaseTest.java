package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/camelcase
 * <p>
 * Created by ringov on 19.07.17.
 */
public class CamelCaseTest {
    @Test
    public void testcase0() throws Exception {
        String str = "saveChangesInTheEditor";
        int expectedResult = 5;
        int result = CamelCase.solve(str);

        assertTrue(expectedResult == result);
    }

}