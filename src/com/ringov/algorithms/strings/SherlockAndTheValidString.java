package com.ringov.algorithms.strings;

import java.util.HashMap;
import java.util.Iterator;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 * <p>
 * Created by ringov on 19.07.17.
 */
public class SherlockAndTheValidString {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static String solve(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.putIfAbsent(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }
        }
        if (map.size() == 0 || map.size() == 1) {
            return YES;
        }
        int freq;
        if(!map.containsValue(1)){
            freq = str.length() / map.size();
        }else{
            freq = (str.length() - 1) / (map.size() - 1);
        }

        Iterator<Integer> iterator = map.values().iterator();
        boolean oneExtra = false;
        while (iterator.hasNext()) {
            int crt = iterator.next();
            if (freq != crt) {
                if (Math.abs(freq - crt) > 0 || crt == 1) {
                    if (oneExtra) {
                        return NO;
                    } else {
                        oneExtra = true;
                    }
                }
            }
        }
        return YES;
    }
}
