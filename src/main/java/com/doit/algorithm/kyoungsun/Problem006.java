package com.doit.algorithm.kyoungsun;

public class Problem006 {

    public static int solution(int N) {
        int start = 1;
        int end = 1;
        int sum = 1;
        int solution = 1;

        while (end != N) {
            if (sum == N) {
                solution++;
                end++;
                sum = sum + end;
            } else if (sum > N) {
                sum = sum - start;
                start++;
            } else {
                end++;
                sum = sum + end;
            }
        }

        return solution;
    }
}
