package com.doit.algorithm.kyoungsun;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem003 {

    public static List<Integer> sum(int dataCount, String data, List<String> sections) {
        StringTokenizer stringTokenizer = new StringTokenizer(data);
        int[] s = new int[dataCount + 1];
        for (int i = 1; i <= dataCount; i++) {
            s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        List<Integer> result = new ArrayList<>();
        for (String section : sections) {
            StringTokenizer sectionTokenizer = new StringTokenizer(section);
            int start = Integer.parseInt(sectionTokenizer.nextToken());
            int end = Integer.parseInt(sectionTokenizer.nextToken());
            result.add(s[end] - s[start - 1]);
        }

        return result;
    }
}
