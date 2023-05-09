package com.doit.algorithm.kdg;

public class Problem003 {

    public static int solution(int n, int start, int end) {
        int result = 0;
        int[] numbers = new int[n];
        int index = 0;

        for (int i = n; i >= 1; i--) {
            numbers[index++] = i;
        }

        for (int i = start - 1; i < end; i++) {
            result += numbers[i];
        }
        return result;
    }
}
