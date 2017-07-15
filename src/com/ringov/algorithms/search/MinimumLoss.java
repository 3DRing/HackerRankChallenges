package com.ringov.algorithms.search;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/minimum-loss
 * <p>
 * Created by ringov on 15.07.17.
 */
public class MinimumLoss {
    public static long solve(int n, long[] prices) {
        Pair[] pairs = new Pair[prices.length];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = new Pair(i, prices[i]);
        }
        return finalSolution(pairs);
    }

    private static long finalSolution(Pair[] prices) {
        Arrays.sort(prices, Comparator.comparingLong(p -> p.value));
        long min = Long.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            long loss = prices[i + 1].value - prices[i].value;
            if (loss > 0) {
                if (min > loss && prices[i].index > prices[i + 1].index) {
                    min = loss;
                }
            }
        }
        return min;
    }

    private static class Pair {
        public int index;
        public long value;

        public Pair(int index, long value) {
            this.index = index;
            this.value = value;
        }
    }

    private static long naiveSolution(long[] prices) {
        long min = 0;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    if (min > prices[i] - prices[j]) {
                        min = prices[i] - prices[j];
                    }
                }
            }
        }
        return min;
    }
}
