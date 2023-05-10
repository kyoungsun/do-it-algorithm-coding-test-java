package com.doit.algorithm.kdg;

public class Problem004 {

    public static int solution(int n, int x1, int y1, int x2, int y2) {
        int result = 0;
        int[][] square = new int[n][n];

        // 정사각형 2차원 배열 만들기
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    square[i - 1][j - 1] = j;
                } else {
                    square[i - 1][j - 1] = i + j - 1;
                }
            }
        }

        // x, y 좌표를 움직이면서 누적
        for (int i = x1 - 1; i < x2; i++) {
            for (int j = y1 - 1; j < y2; j++) {
                result += square[i][j];
            }
        }

        return result;
    }
}
