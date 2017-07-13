package com.ringov.algorithms.search;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by ringov on 13.07.17.
 */
public class IceCreamParlorTest {
    @Test
    public void testcase0() throws Exception {
        int m = 4;
        int n = 5;
        int[] arr = {1, 4, 5, 3, 2};
        int[] result = IceCreamParlor.solve(m, n, arr);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 4);
    }

    @Test
    public void testcase1() throws Exception {
        int m = 4;
        int n = 4;
        int[] arr = {2, 2, 4, 3};
        int[] result = IceCreamParlor.solve(m, n, arr);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 2);
    }

    @Test
    public void testcase2() throws Exception {
        Scanner input = new Scanner(new File("IceCreamParlor_testcase3.txt"));
        Scanner output = new Scanner(new File("IceCreamParlor_testcase3_results.txt"));

        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int m = input.nextInt();
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = input.nextInt();
            }
            int[] result = IceCreamParlor.solve(m, n, arr);

            int expected1 = output.nextInt();
            int expected2 = output.nextInt();

            assertTrue(expected1 == result[0]);
            assertTrue(expected2 == result[1]);
        }
    }

    @Test
    public void testcase2_18() throws Exception {
        Scanner input = new Scanner(new File("IceCreamParlor_testcase3_18.txt"));
        int m = input.nextInt();
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int[] result = IceCreamParlor.solve(m, n, arr);
        assertTrue(result[0] == 750);
        assertTrue(result[1] == 965);
    }

}