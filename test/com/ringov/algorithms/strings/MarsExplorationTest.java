package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 20.07.17.
 */
public class MarsExplorationTest {
    @Test
    public void testcase0() throws Exception {
        String s = "SOSSPSSQSSOR";
        assertTrue(MarsExploration.solve(s) == 3);
    }

    @Test
    public void testcase1() throws Exception {
        String s = "SOSSOT";
        assertTrue(MarsExploration.solve(s) == 1);
    }
}