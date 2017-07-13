package com.ringov.algorithms.implementation;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by ringov on 10.07.17.
 */
public class NonDivisibleSubsetTest {
    @Test
    public void solveT1() throws Exception {
        int n = 4;
        int k = 3;
        int[] arr = {1, 7, 2, 4};

        int result = NonDivisibleSubset.solve(n, k, arr);
        assertTrue(result == 3);
    }

    @Test
    public void solveT2() throws Exception {
        int n = 6;
        int k = 5;
        int[] arr = {1, 7, 2, 4, 5, 10};

        int result = NonDivisibleSubset.solve(n, k, arr);
        assertTrue(result == 4);
    }

    @Test
    public void testCase15() throws Exception {
        Scanner sc = new Scanner(new File("NonDivisibleSubset_testcase15.txt"));
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = NonDivisibleSubset.solve(n, k, arr);
        assertTrue(result == 47410);
    }

}