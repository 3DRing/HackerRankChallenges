package com.ringov.algorithms.warmup;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Source: https://www.hackerrank.com/challenges/birthday-cake-candles
 * <p>
 * Created by ringov on 06.07.17.
 */
public class BirthdayCakeCandlesTest {

    @Test
    public void birthdayCakeCandlesT1() {
        int n = 4;
        int[] arr = {3, 2, 1, 3};
        int result = BirthdayCakeCandles.birthdayCakeCandles(n, arr);
        assertTrue(result == 2);
    }

    @Test
    public void birthdayCakeCandlesT2() {
        int n = 7;
        int[] arr = {1, 7, 1, 4, 7, 7, 5};
        int result = BirthdayCakeCandles.birthdayCakeCandles(n, arr);
        assertTrue(result == 3);
    }
}