package com.doit.algorithm.kyoungsun;

public class Problem002 {

    public static double average(int[] numbers) {
        long sum = 0;
        long max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        return sum * 100.0 / max / numbers.length;
    }

}
