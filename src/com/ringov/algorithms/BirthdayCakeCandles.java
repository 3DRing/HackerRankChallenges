package com.ringov.algorithms;

/**
 * Created by ringov on 06.07.17.
 */
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] arr) {
        int counter = 0;
        int tallest = 0;
        for (int i = 0; i < n; i++) {
            if (tallest < arr[i]) {
                counter = 1;
                tallest = arr[i];
            } else {
                if (tallest != 0 && tallest == arr[i]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
