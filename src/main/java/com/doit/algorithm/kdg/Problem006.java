package com.doit.algorithm.kdg;

public class Problem006 {

    public static int solution(int n) {
        int result = 1;

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum > n) break;
                else if (sum == n){
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}
