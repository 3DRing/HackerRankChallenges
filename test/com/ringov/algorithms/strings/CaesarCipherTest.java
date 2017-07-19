package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 19.07.17.
 */
public class CaesarCipherTest {
    @Test
    public void testcase0() throws Exception {
        int n = 11;
        String str = "middle-Outz";
        int k = 2;

        String expectedResult = "okffng-Qwvb";
        String result = CaesarCipher.solve(str, k);
        assertTrue(expectedResult.equals(result));
    }

}