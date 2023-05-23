package com.doit.algorithm.kyoungsun;

import java.util.Scanner;

public class Problem015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        int[] sort = sort(N, input);
        for (int i : sort) {
            System.out.println(i);
        }
    }

    public static int[] sort(int length, int[] input) {
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        return input;
    }

}
