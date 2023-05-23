package com.doit.algorithm.kyoungsun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int solve = solve(N, A);
        System.out.println(solve);
    }

    public static int solve(int n, int[] a) {
        // 처음 인덱스 정보 저장
        Map<Integer, Integer> beforeSort = new HashMap<>();
        for (int i = 0; i < n; i++) {
            beforeSort.put(a[i], i);
        }

        Arrays.sort(a);

        Map<Integer, Integer> sorted = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sorted.put(a[i], i);
        }

        int MAX = 0;
        for (int i = 0; i < n; i++) {
            int subtract = beforeSort.get(a[i]) - sorted.get(a[i]);
            if (subtract > MAX) {
                MAX = subtract;
            }
        }

        return MAX + 1;
    }

}


