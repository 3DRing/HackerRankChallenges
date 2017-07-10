package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls
 * <p>
 * Created by ringov on 10.07.17.
 */
public class OrganizingContainersOfBallsTest {

    @Test
    public void testCase0() throws Exception {
        int n = 2;
        int[][] m = {{1, 1}, {1, 1}};

        String result = OrganizingContainersOfBalls.solve(n, m);
        assertTrue(result.equals(OrganizingContainersOfBalls.POSSIBLE));
    }

    @Test
    public void testCase1() throws Exception {
        int n = 2;
        int[][] m = {{0, 2}, {1, 1}};

        String result = OrganizingContainersOfBalls.solve(n, m);
        assertTrue(result.equals(OrganizingContainersOfBalls.IMPOSSIBLE));
    }

    @Test
    public void solveT1() throws Exception {
        int n = 3;
        int[][] m = {{4, 2, 1}, {2, 1, 4}, {1, 4, 2}};

        String result = OrganizingContainersOfBalls.solve(n, m);
        assertTrue(result.equals(OrganizingContainersOfBalls.POSSIBLE));
    }

    @Test
    public void solveT2() throws Exception {
        int n = 4;
        int[][] m = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};

        String result = OrganizingContainersOfBalls.solve(n, m);
        assertTrue(result.equals(OrganizingContainersOfBalls.POSSIBLE));
    }

    @Test
    public void solveT3() throws Exception {
        int n = 3;
        int[][] m = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

        String result = OrganizingContainersOfBalls.solve(n, m);
        assertTrue(result.equals(OrganizingContainersOfBalls.POSSIBLE));
    }
}