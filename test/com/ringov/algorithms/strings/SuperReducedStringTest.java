package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 *
 * Created by ringov on 19.07.17.
 */
public class SuperReducedStringTest {
    @Test
    public void testcase0() throws Exception {
        String str = "aaabccddd";
        String expectedResult = "abd";
        String result = SuperReducedString.solve(str);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase1() throws Exception {
        String str = "baab";
        String expectedResult = "Empty String";
        String result = SuperReducedString.solve(str);
        assertTrue(expectedResult.equals(result));
    }

}