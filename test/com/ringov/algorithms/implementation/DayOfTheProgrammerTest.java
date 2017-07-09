package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer
 *
 * Created by ringov on 06.07.17.
 */
public class DayOfTheProgrammerTest {
    @Test
    public void solveT1() throws Exception {
        int input = 2017;
        String result = DayOfTheProgrammer.solve(input);

        assertTrue(result.equals("13.09.2017"));
    }
    @Test
    public void solveT2() throws Exception {
        int input = 2016;
        String result = DayOfTheProgrammer.solve(input);

        assertTrue(result.equals("12.09.2016"));
    }
    @Test
    public void solveT3() throws Exception {
        int input = 1918;
        String result = DayOfTheProgrammer.solve(input);

        assertTrue(result.equals("26.09.1918"));
    }
    @Test
    public void solveT4() throws Exception {
        int input = 1700;
        String result = DayOfTheProgrammer.solve(input);

        assertTrue(result.equals("12.09.1700"));
    }
}