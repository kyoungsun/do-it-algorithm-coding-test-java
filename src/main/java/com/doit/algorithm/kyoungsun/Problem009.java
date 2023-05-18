package com.doit.algorithm.kyoungsun;

import java.util.StringTokenizer;

public class Problem009 {

    public static int[] checkArr = new int[4];
    public static int[] myArr = new int[4];
    public static int validCount = 0;

    public static int solution(String input) {
        StringTokenizer stringTokenizer = new StringTokenizer(input);
        int s = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        char[] chars = stringTokenizer.nextToken().toCharArray();
        int result = 0;

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (checkArr[i] == 0) {
                validCount++;
            }
        }

        for (int i = 0; i < p; i++) {
            add(chars[i]);
        }

        if (validCount == 4) {
            result++;
        }

        for (int i = p; i < s; i++) {
            int j = i - p;
            add(chars[i]);
            remove(chars[j]);

            if (validCount == 4) {
                result++;
            }
        }

        return result;
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    validCount++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    validCount++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    validCount++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    validCount++;
                }
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    validCount--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    validCount--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    validCount--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    validCount--;
                }
                myArr[3]--;
                break;
        }
    }
}
