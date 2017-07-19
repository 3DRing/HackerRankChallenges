package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/two-characters
 * <p>
 * Created by ringov on 19.07.17.
 */
public class TwoCharactersTest {
    @Test
    public void testcase0() throws Exception {
        int n = 10;
        String str = "beabeefeab";

        int expectedResult = 5;
        int result = TwoCharacters.solve(str);
        assertTrue(expectedResult == result);
    }

}