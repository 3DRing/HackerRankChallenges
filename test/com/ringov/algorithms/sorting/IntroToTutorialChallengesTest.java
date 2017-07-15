package com.ringov.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 *
 * Created by ringov on 15.07.17.
 */
public class IntroToTutorialChallengesTest {
    @Test
    public void testcase0() throws Exception {
        int V = 4;
        int n = 6;
        int[] array = {1, 4, 5, 7, 9, 12};

        int result = IntroToTutorialChallenges.solve(n, array, V);
        assertTrue(result == 1);
    }

}