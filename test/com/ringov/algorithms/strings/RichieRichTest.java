package com.ringov.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.hackerrank.com/challenges/richie-rich
 *
 * Created by ringov on 20.07.17.
 */
public class RichieRichTest {
    @Test
    public void testcase0() throws Exception {
        int n = 4;
        int k = 1;
        String s = "3943";

        String expectedResult = "3993";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase1() throws Exception {
        int n = 6;
        int k = 3;
        String s = "092282";

        String expectedResult = "992299";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase2() throws Exception {
        int n = 4;
        int k = 1;
        String s = "0011";

        String expectedResult = "-1";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase3() throws Exception {
        int k = 22;
        String s = "13579169431";

        String expectedResult = "99999999999";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase4() throws Exception {
        int k = 5;
        String s = "13579169431";

        String expectedResult = "93599199539";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase5() throws Exception {
        int k = 3;
        String s = "0000245";

        String expectedResult = "5420245";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase6() throws Exception {
        int k = 1;
        String s = "000020";

        String expectedResult = "020020";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase7() throws Exception {
        int k = 2;
        String s = "01";

        String expectedResult = "99";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase8() throws Exception {
        int k = 1;
        String s = "013";

        String expectedResult = "313";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase9() throws Exception {
        int k = 1;
        String s = "0139";

        String expectedResult = "-1";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase10() throws Exception {
        int k = 0;
        String s = "5";

        String expectedResult = "5";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase11() throws Exception {
        int k = 1;
        String s = "9";

        String expectedResult = "9";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase12() throws Exception {
        int k = 1;
        String s = "909";

        String expectedResult = "999";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase13() throws Exception {
        int k = 2;
        String s = "1000";

        String expectedResult = "9009";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase14() throws Exception {
        int k = 3;
        String s = "1000";

        String expectedResult = "9009";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase15() throws Exception {
        int k = 4;
        String s = "10000";

        String expectedResult = "99099";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }

    @Test
    public void testcase16() throws Exception {
        int k = 2;
        String s = "932239";

        String expectedResult = "992299";
        String result = RichieRich.solve(s, k);
        assertTrue(expectedResult.equals(result));
    }
}