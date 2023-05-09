package com.doit.algorithm.kdg;

public class Problem001 {

    private static final char ZERO = 48;

    public static int solution1(int length, String s) {
        int result = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) > ZERO) result += s.charAt(i) - ZERO;
        }

        return result;
    }

    public static int solution2(String s) {
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c > ZERO)
                result += c - ZERO;
        }

        return result;
    }

    public static int solution3(String s) {
        return s.chars()
            .map(n -> n - ZERO)
            .sum();
    }
}
