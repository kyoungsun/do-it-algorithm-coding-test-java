package com.doit.algorithm.kdg;

import java.util.Arrays;

public class Problem008 {

    public static int solution(int n, String s) {
        int result = 0;
        int[] numbers = new int[n];
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.valueOf(split[i]);
        }

        Arrays.sort(numbers);

        for (int i = 0; i < n; i++) {
            int target = numbers[i];
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    if (left != i && right != i) {
                        result++;
                        break;
                    } else if (left == i) {
                        left++;
                    }
                    else if (right == i) {
                        right--;
                    }
                } else if(numbers[left] + numbers[right] > numbers[i]) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
