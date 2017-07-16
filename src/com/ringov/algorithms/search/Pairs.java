package com.ringov.algorithms.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ringov on 16.07.17.
 */
public class Pairs {
    private static HashMap<Integer, Integer> extra;

    public static int solve(int[] array, int k) {
        extra = new HashMap<>();
        HashMap<Integer, Set<Integer>> sum = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int combinedSum = 2 * array[i] + k;
            checkMap(sum, combinedSum, array[i]);
            if (array[i] > k) {
                int combinedSub = 2 * array[i] - k;
                checkMap(sum, combinedSub, array[i]);
            }
        }

        int pairNumber = 0;
        Iterator<Integer> iterator = sum.keySet().iterator();
        while (iterator.hasNext()) {
            int crt = iterator.next();
            Set<Integer> crtSet = sum.get(crt);
            Integer ex = extra.get(crt);
            ex = ex == null ? 0 : ex;
            pairNumber += (crtSet.size() + ex) / 2;
        }

        return pairNumber;
    }

    private static void checkMap(HashMap<Integer, Set<Integer>> map, int combined, int element) {
        Set<Integer> s = map.get(combined);
        if (s == null) {
            s = new HashSet<>();
            s.add(element);
            map.put(combined, s);
        } else {
            if (s.contains(element)) {
                Integer ex = extra.get(combined);
                if (ex != null) {
                    ex += 1;
                    extra.put(combined, ex);
                } else {
                    extra.put(combined, 1);
                }
            } else {
                s.add(element);
            }
        }
    }
}
