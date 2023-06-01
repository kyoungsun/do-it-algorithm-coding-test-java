package com.doit.algorithm.kyoungsun;

import com.doit.algorithm.kyoungsun.util.AdjacencyList;

import java.util.StringTokenizer;

public class Problem023 {

    public static void main(String[] args) {
//        String input =
//                "6 5\n" +
//                "1 2\n" +
//                "2 5\n" +
//                "5 1\n" +
//                "3 4\n" +
//                "4 6";

        String input =
                "6 8\n" +
                "1 2\n" +
                "2 5\n" +
                "5 1\n" +
                "3 4\n" +
                "4 6\n" +
                "5 4\n" +
                "2 4\n" +
                "2 3";
        StringTokenizer stringTokenizer = new StringTokenizer(input);
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        AdjacencyList adjacencyList = new AdjacencyList(N);
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            adjacencyList.put(x, y);
        }

        boolean[] visited = new boolean[N + 1];

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adjacencyList, visited);
            }
        }

        System.out.println(count);
    }

    public static void dfs(int v, AdjacencyList adjacencyList, boolean[] visited) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (Integer i : adjacencyList.get(v)) {
            if (!visited[i]) {
                dfs(i, adjacencyList, visited);
            }
        }
    }


}
