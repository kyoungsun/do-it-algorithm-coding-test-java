package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem016Test {

    @Test
    void testCase1() {
        int N = 5;
        int[] A = new int[]{10, 1, 5, 2, 3};
        int solved = Problem016.solve(N, A);
        assertThat(solved).isEqualTo(3);
    }

    @Test
    void testCase2() {
        int N = 5;
        int[] A = new int[]{1, 3, 5, 7, 9};
        int solved = Problem016.solve(N, A);
        assertThat(solved).isEqualTo(1);
    }
}