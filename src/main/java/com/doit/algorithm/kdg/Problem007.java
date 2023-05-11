package com.doit.algorithm.kdg;


public class Problem007 {

    public static int solution(int n, int m , String s) {
        int result = 0;
        int[] numbers = new int[n];
        int index = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers[index++] = Character.getNumericValue(c);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == m) result++;
            }
        }

        return result;
    }
}
