package com.ringov.algorithms.strings;

/**
 * https://www.hackerrank.com/challenges/richie-rich
 * <p>
 * Created by ringov on 20.07.17.
 */
public class RichieRich {

    public static String solve(String s, int k) {
        int diffCounter = 0;
        int mid = s.length() / 2;
        boolean[] diff = new boolean[mid];
        int[] greater = new int[mid];
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            int l = (int) s.charAt(i) - '0';
            int r = (int) s.charAt(j) - '0';
            if (l != r) {
                diffCounter++;
                diff[i] = true;
                greater[i] = l < r ? r : l;
            } else {
                diff[i] = false;
                greater[i] = l;
            }
        }

        if (diffCounter > k) {
            return "-1";
        }

        if (diffCounter == k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < greater.length; i++) {
                sb.append(greater[i]);
            }
            String original = sb.toString();
            sb.reverse();
            sb.insert(0, original);
            if (s.length() % 2 != 0) {
                sb.insert(mid, s.charAt(mid));
            }
            return sb.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            int changesLeft = k - diffCounter;
            for (int j = 0; j < greater.length; j++) {
                if (diff[j]) {
                    if (greater[j] != 9) {
                        if (changesLeft > 0) {
                            sb.append(9);
                            changesLeft--;
                        } else {
                            sb.append(greater[j]);
                        }
                    } else {
                        sb.append(greater[j]);
                    }
                } else {
                    if (greater[j] != 9) {
                        if (changesLeft - 1 > 0) {
                            sb.append(9);
                            changesLeft -= 2;
                        } else {
                            sb.append(greater[j]);
                        }
                    } else {
                        sb.append(greater[j]);
                    }
                }
            }
            String original = sb.toString();
            sb.reverse();
            sb.insert(0, original);
            if (s.length() % 2 != 0) {
                if (changesLeft > 0) {
                    sb.insert(mid, 9);
                } else {
                    sb.insert(mid, s.charAt(mid));
                }
            }
            return sb.toString();
        }
    }
}
