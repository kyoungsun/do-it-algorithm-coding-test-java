package com.doit.algorithm.kdg;

import java.util.LinkedList;
import java.util.Queue;

public class Problem013 {

    public static int solution(int n) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        return queue.poll();
    }
}
