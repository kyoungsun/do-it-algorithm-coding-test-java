package com.doit.algorithm.kdg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += in.nextInt() + " ";
        }

        String result = solution(n, s);

        System.out.println(result);
    }

    public static String solution(int n, String s) {
        List<Integer> result = new ArrayList<>();
        int[] numbers = new int[n];

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = n -1; j > i; j--) {
                if (numbers[i] < numbers[j]) {
                    max = numbers[j];
                }
            }
            if (max == 0 ) result.add(-1);
            else result.add(max);
        }

        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
