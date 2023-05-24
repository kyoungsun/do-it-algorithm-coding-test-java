package com.doit.algorithm.kyoungsun;

import java.util.Scanner;

public class Problem017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[str.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        int[] solve = solve(a);
        for (int j : solve) {
            System.out.print(j);
        }
    }

    public static int[] solve(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int maxIndex = i;
            for (int j = i; j < a.length; j++) {
                 if (a[j] > a[maxIndex]) {
                     maxIndex = j;
                 }
            }

            if (a[i] < a[maxIndex]) {
                int temp = a[i];
                a[i] = a[maxIndex];
                a[maxIndex] = temp;
            }
        }
        return a;
    }
}
