package com.doit.algorithm.kyoungsun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class Problem026 {

//    private static final String INPUT = "4 5 1\n" +
//            "1 2\n" +
//            "1 3\n" +
//            "1 4\n" +
//            "2 4\n" +
//            "3 4";

//    private static final String INPUT = "5 5 3\n" +
//            "5 4\n" +
//            "5 2\n" +
//            "1 2\n" +
//            "3 4\n" +
//            "3 1";

//    private static final String INPUT = "1000 1 1000\n" +
//            "999 1000";

    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer(INPUT);
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(st.nextToken());

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int startNode = sc.nextInt();

        AdjacencyList adjacencyList = new AdjacencyList(N);
        for (int i = 0; i < M; i++) {
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
            int start = sc.nextInt();
            int end = sc.nextInt();
            adjacencyList.put(start, end);
        }

        // 낮은 번호부터 탐색하기 위해 인접리스트 정렬
        adjacencyList.sort();
        adjacencyList.printDfs(startNode);
        adjacencyList.printBfs(startNode);
    }

    public static class AdjacencyList {


        private final List<Integer>[] A;

        public AdjacencyList(int totalNodeCount) {
            A = new List[totalNodeCount + 1];
            for (int i = 1; i < totalNodeCount + 1; i++) {
                A[i] = new ArrayList<>();
            }
        }

        public void put(int start, int end) {
            A[start].add(end);
            A[end].add(start);
        }

        public void sort() {
            for (int i = 1; i < A.length; i++) {
                A[i].sort(Comparator.naturalOrder());
            }
        }

        public void printDfs(int startNode) {
            List<Integer> visited = new ArrayList<>();
            visited.add(startNode);

            dfs(startNode, visited);

            StringJoiner stringJoiner = new StringJoiner(" ");
            for (Integer i : visited) {
                stringJoiner.add(String.valueOf(i));
            }
            System.out.println(stringJoiner);
        }

        private void dfs(int node, List<Integer> visited) {
            for (Integer i : A[node]) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    dfs(i, visited);
                }
            }
        }

        public void printBfs(int startNode) {
            List<Integer> visited = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(startNode);

            while (!queue.isEmpty()) {
                Integer poll = queue.poll();
                if (visited.contains(poll)) {
                    continue;
                }
                visited.add(poll);

                List<Integer> integers = A[poll];
                for (Integer i : integers) {
                    if (visited.contains(i)) {
                        continue;
                    }
                    queue.add(i);
                }
            }

            StringJoiner stringJoiner = new StringJoiner(" ");
            for (Integer i : visited) {
                stringJoiner.add(String.valueOf(i));
            }
            System.out.println(stringJoiner);
        }
    }
}
