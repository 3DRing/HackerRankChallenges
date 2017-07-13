package com.ringov.algorithms.implementation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 *
 * Created by ringov on 12.07.17.
 */
public class AlmostSortedTest {
    @Test
    public void testcase0() throws Exception {
        int n = 2;
        int[] arr = {4, 2};
        String expectedResult = "yes\nswap 1 2";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase1() {
        int n = 3;
        int[] arr = {3, 1, 2};
        String expectedResult = "no";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase2() {
        int n = 6;
        int[] arr = {1, 5, 4, 3, 2, 6};
        String expectedResult = "yes\nreverse 2 5";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase3() {
        int n = 4;
        int[] arr = {1, 2, 4, 6};
        String expectedResult = "yes";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase4() {
        int n = 8;
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        String expectedResult = "yes\nreverse 1 8";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase5() {
        int n = 8;
        int[] arr = {1, 2, 3, 4, 8, 7, 6, 5};
        String expectedResult = "yes\nreverse 5 8";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase6() {
        int n = 4;
        int[] arr = {1, 2, 7, 3};
        String expectedResult = "yes\nswap 3 4";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase7() {
        int n = 4;
        int[] arr = {1, 2, 7, 3, 6};
        String expectedResult = "no";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase8() {
        int n = 8;
        int[] arr = {1, 2, 7, 3, 9, 10, 15, 12};
        String expectedResult = "no";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase9() {
        int n = 7;
        int[] arr = {4, 3, 2, 1, 10, 9, 8};
        String expectedResult = "no";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase10() {
        int n = 9;
        int[] arr = {1, 3, 5, 7, 13, 10, 11, 8, 15};
        String expectedResult = "yes\nswap 5 8";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase11() {
        int n = 8;
        int[] arr = {1, 3, 5, 7, 13, 10, 8, 15};
        String expectedResult = "yes\nswap 5 7";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void myTestcase12() {
        int n = 5;
        int[] arr = {6, 3, 5, 7, 13};
        String expectedResult = "no";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase13() throws Exception {
        int n = 3;
        int[] arr = {4, 2, 1};
        String expectedResult = "yes\nswap 1 3";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase14() throws Exception {
        int n = 3;
        int[] arr = {1, 3, 2};
        String expectedResult = "yes\nswap 2 3";
        String result = AlmostSorted.solve(n, arr);
        assertTrue(expectedResult.equals(result));
    }
}