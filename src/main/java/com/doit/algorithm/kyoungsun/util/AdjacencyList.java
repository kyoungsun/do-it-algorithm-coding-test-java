package com.doit.algorithm.kyoungsun.util;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

    private List<Integer>[] a;

    public AdjacencyList(int initialCapacity) {
        this.a = new ArrayList[initialCapacity + 1];
        for (int i = 1; i <= initialCapacity; i++) {
            a[i] = new ArrayList<>();
        }
    }

    public List<Integer> get(int index) {
        return a[index];
    }

    public void put(int x, int y) {
        a[x].add(y);
        a[y].add(x);
    }


    public void print() {
        for (int i = 1; i < a.length; i++) {
            List<Integer> integers = a[i];
            for (Integer integer : integers) {
                System.out.println(i + " -> " + integer);
            }
        }
    }
}
