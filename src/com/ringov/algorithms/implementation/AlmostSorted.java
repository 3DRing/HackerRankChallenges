package com.ringov.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 *
 * Created by ringov on 12.07.17.
 */
public class AlmostSorted {

    private static final String YES = "yes";
    private static final String NO = "no";
    private static final String SWAP = "swap";
    private static final String REVERSE = "reverse";

    public static String solve(int n, int[] arr) {
        return secondSolution(n, arr);
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

    private static String firstSolution(int n, int[] arr) {
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

    private static String secondSolution(int n, int[] arr) {
        int[] prime = new int[arr.length - 1];

        List<Integer> decrease = new ArrayList<>();

        for (int i = 0; i < prime.length; i++) {
            prime[i] = arr[i + 1] - arr[i];
            if (prime[i] < 0) {
                decrease.add(i);
            }
        }

        if (decrease.size() == 0) {
            return YES;
        }
        if (decrease.size() == 1) {
            int l = decrease.get(0);
            int r = l + 1;
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            if (isSorted(arr)) {
                return yesSwap(l, r);
            } else {
                return NO;
            }
        }
        if (decrease.size() == 2) {
            boolean seq = true;
            int prev = decrease.get(0);
            for (int i = 1; i < decrease.size(); i++) {
                if (prev + 1 != decrease.get(i)) {
                    seq = false;
                    break;
                }
                prev = decrease.get(i);
            }
            if (seq) {
                int l = decrease.get(0);
                int r = decrease.get(1) + 1;
                int tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                if (isSorted(arr)) {
                    return yesSwap(l, r);
                } else {
                    return NO;
                }
            } else {
                int l = decrease.get(0);
                int r = decrease.get(1) + 1;
                int tmp = arr[l];
                arr[l] = arr[r];
                arr[r] = tmp;
                if (isSorted(arr)) {
                    return yesSwap(l, r);
                } else {
                    return NO;
                }
            }
        } else {
            int prev = decrease.get(0);
            for (int i = 1; i < decrease.size(); i++) {
                if (prev + 1 != decrease.get(i)) {
                    return NO;
                }
                prev = decrease.get(i);
            }
            int l = decrease.get(0);
            int r = decrease.get(decrease.size() - 1) + 1;
            int[] tmp = new int[decrease.size() + 1];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = arr[r - i];
            }
            for (int i = 0; i < tmp.length; i++) {
                arr[l + i] = tmp[i];
            }
            if (isSorted(arr)) {
                return yesReverse(l, r);
            } else {
                return NO;
            }
        }
    }

    private static String yesSwap(int l, int r) {
        return YES + "\n" + SWAP + " " + (l + 1) + " " + (r + 1);
    }

    private static String yesReverse(int l, int r) {
        return YES + "\n" + REVERSE + " " + (l + 1) + " " + (r + 1);
    }
}
