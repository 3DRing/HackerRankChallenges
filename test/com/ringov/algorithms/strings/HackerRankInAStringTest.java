package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string
 * <p>
 * Created by ringov on 20.07.17.
 */
public class HackerRankInAStringTest {
    @Test
    public void testcase0() throws Exception {
        int q = 2;
        String[] s = {"hereiamstackerrank", "hackerworld"};
        String[] expected = {"YES", "NO"};

        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i].equals(HackerRankInAString.solve(s[i])));
        }
    }
}