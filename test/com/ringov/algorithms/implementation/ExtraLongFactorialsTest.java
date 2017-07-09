package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 10.07.17.
 */
public class ExtraLongFactorialsTest {
    @Test
    public void solveT1() throws Exception {
        int n = 1;
        assertTrue(ExtraLongFactorials.solve(n).equals("1"));
    }

    @Test
    public void solveT2() throws Exception {
        int n = 2;
        assertTrue(ExtraLongFactorials.solve(n).equals("2"));
    }

    @Test
    public void solveT3() throws Exception {
        int n = 3;
        assertTrue(ExtraLongFactorials.solve(n).equals("6"));
    }

    @Test
    public void solveT4() throws Exception {
        int n = 4;
        assertTrue(ExtraLongFactorials.solve(n).equals("24"));
    }

    @Test
    public void solveT5() throws Exception {
        int n = 25;
        assertTrue(ExtraLongFactorials.solve(n).equals("15511210043330985984000000"));
    }
}