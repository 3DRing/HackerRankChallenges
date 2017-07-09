package com.ringov.algorithms.implementation;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials
 * <p>
 * Created by ringov on 10.07.17.
 */
public class ExtraLongFactorials {

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(new BigInteger("1"))) {
            return n;
        }
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }

    public static String solve(int n) {
        return factorial(new BigInteger(n + "")).toString();
    }

}
