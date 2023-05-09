package com.doit.algorithm.kdg;

public class Problem002 {

    public static double solution(int n, int[] scores) {
        double result = 0;
        int max = findMax(n, scores);

        for (int i = 0; i < n; i++) {
            result += (double) scores[i] / max * 100;
        }

        return result / n;
    }

    public static int findMax(int n, int[] scores) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (result < scores[i]) {
                result = scores[i];
            }
        }
        return result;
    }
}
