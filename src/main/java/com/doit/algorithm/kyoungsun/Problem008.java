package com.doit.algorithm.kyoungsun;

import java.util.Arrays;

public class Problem008 {

    public static int solution(int N, int[] A) {
        Arrays.sort(A);
        int result = 0;
        for (int k = 0; k < N; k++) {
            long target = A[k];
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if (A[i] + A[j] == target) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return result;
    }
}
