package com.doit.algorithm.kyoungsun;

import java.util.Scanner;

public class Problem005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int solution = solution(N, M, A);
        System.out.println(solution);
    }

    public static int solution(int N, int M, int[] A) {
        // 합 배열 구하기
        int[] S = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + A[i - 1];
        }

        // 구간 찾기
        int conditions = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if ((S[j] - S[i]) % M == 0) {
                    conditions++;
                }
            }
        }

        return conditions;
    }
}
