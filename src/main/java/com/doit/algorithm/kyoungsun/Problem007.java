package com.doit.algorithm.kyoungsun;

import java.util.Arrays;

public class Problem007 {

    public static int solution(int N, int M, int[] A) {
        int result = 0;

        Arrays.sort(A);
        int start = 0;
        int end = N - 1;

        while (start < end) {
            if (A[start] + A[end] == M) {
                result++;
                end--;
            } else if (A[start] + A[end] < M) {
                start++;
            } else {
                end--;
            }
        }

        return result;
    }
}
