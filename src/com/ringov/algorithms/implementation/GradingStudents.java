package com.ringov.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/grading
 *
 * Created by ringov on 06.07.17.
 */
public class GradingStudents {

    private static int gradeRound(int grade) {
        if (grade < 38) {
            return grade;
        }
        int nextRounding = (grade + 2);
        int extra = nextRounding % 5;
        boolean canRound = extra < 3;

        if (canRound) {
            return nextRounding - extra;
        }
        return grade;
    }

    public static int[] solve(int[] grades) {
        int[] results = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            results[i] = gradeRound(grades[i]);
        }

        return results;
    }
}
