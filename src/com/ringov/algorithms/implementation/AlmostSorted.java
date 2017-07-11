package com.ringov.algorithms.implementation;

/**
 * Created by ringov on 12.07.17.
 */
public class AlmostSorted {

    private static final String YES = "yes";
    private static final String NO = "no";
    private static final String SWAP = "swap";
    private static final String REVERSE = "reverse";

    public static String solve(int n, int[] arr) {
        int swapCaseCount = 0;
        int swapCaseIndex = 0;

        int reverseCaseCount = 0;
        int reverseCaseIndexL = -1;
        int reverseCaseIndexR = 0;

        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev > arr[i]) {
                if (swapCaseCount == 0) {
                    swapCaseIndex = i;
                    swapCaseCount++;
                } else {
                    if (reverseCaseCount < 1) {
                        if (i - swapCaseIndex == 1) {
                            if (reverseCaseIndexL == -1) {
                                reverseCaseIndexL = swapCaseIndex - 1;
                            }
                        }
                        reverseCaseIndexR = i;
                    } else {
                        return NO;
                    }
                }
            } else {
                if (reverseCaseIndexL != -1) {
                    reverseCaseCount++;
                }
            }
            prev = arr[i];
        }

        if (swapCaseCount == 0 && reverseCaseCount == 0) {
            return YES;
        } else {
            if (reverseCaseIndexL != -1 && reverseCaseCount <= 1) {
                return YES + "\n" + REVERSE + " " + (reverseCaseIndexL + 1) + " " + (reverseCaseIndexR + 1);
            } else if (swapCaseCount == 1) {

                // swapping
                int tmp = arr[swapCaseIndex];
                arr[swapCaseIndex] = arr[swapCaseIndex - 1];
                arr[swapCaseIndex - 1] = tmp;

                if (isSorted(arr)) {
                    return YES + "\n" + SWAP + " " + ((swapCaseIndex + 1) - 1) + " " + (swapCaseIndex + 1);
                } else {
                    return NO;
                }
            } else {
                return NO;
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev > arr[i]) {
                return false;
            }
            prev = arr[i];
        }
        return true;
    }
}
