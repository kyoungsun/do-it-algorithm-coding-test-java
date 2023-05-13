package com.doit.algorithm.kdg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());       // 9
        int len = Integer.parseInt(st.nextToken());     // 8
        String words = br.readLine();                   // DNA 문자열
        String s = br.readLine();                       // 포함 갯수

        int result = solution(n, len, words, s);

        System.out.println(result);
    }

    public static int solution(int n, int len, String s, String max) {
        int result = 0;
        char[] words = new char[n];
        int[] includes = new int[4];
        int[] myIncludes = new int[4];

        for (int i = 0; i < s.length(); i++) {
            words[i] = s.charAt(i);
        }

        String[] split = max.split(" ");
        for (int i = 0; i < split.length; i++) {
            includes[i] = Integer.parseInt(split[i]);
        }

        char[] move = move(0, len, words);
        add(move, myIncludes);
        boolean checked = checked(myIncludes, includes);
        if (checked) result++;

        for (int i = len; i < n; i++) {
            int next = n - len;
            move = move(next, len, words);
            init(myIncludes);
            add(move, myIncludes);
            checked = checked(myIncludes, includes);
            if (checked) result++;
        }

        return result;
    }

    private static char[] move(int start, int end, char[] words) {
        char[] result = new char[end];
        int index = 0;

        for (int i = start; i < start + end; i++) {
            result[index++] = words[i];
        }
        return result;
    }

    private static void add(char[] move, int[] myIncludes) {
        for (int i = 0; i < move.length; i++) {
            switch (move[i]) {
                case 'A':
                    myIncludes[0]++;
                    break;
                case 'C':
                    myIncludes[1]++;
                    break;
                case 'G':
                    myIncludes[2]++;
                    break;
                case 'T':
                    myIncludes[3]++;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private static void init(int[] myIncludes) {
        for (int i = 0; i < myIncludes.length; i++) {
            myIncludes[i] = 0;
        }
    }

    private static boolean checked(int[] myIncludes, int[] includes) {
        return myIncludes[0] == includes[0] &&
                myIncludes[1] == includes[1] &&
                myIncludes[2] == includes[2] &&
                myIncludes[3] == includes[3];
    }
}
