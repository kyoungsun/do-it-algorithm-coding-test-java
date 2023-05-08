package com.doit.algorithm.kyoungsun;

public class Problem001 {
    public static int sum(int length, String numbers) {
        char[] chars = numbers.toCharArray();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        return sum;
    }
}
