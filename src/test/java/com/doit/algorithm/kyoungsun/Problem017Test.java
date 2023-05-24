package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Problem017Test {

    @Test
    void testCase1() {
        int[] a = new int[]{2, 1, 4, 3};
        int[] solve = Problem017.solve(a);
        assertThat(solve).containsExactly(4, 3, 2, 1);
    }

    @Test
    void testCase2() {
        int[] a = new int[]{9, 9, 9, 9, 9, 8, 9, 9, 9};
        int[] solve = Problem017.solve(a);
        assertThat(solve).containsExactly(9, 9, 9, 9, 9, 9, 9, 9, 8);
    }

    @Test
    void testCase3() {
        int[] a = new int[]{6, 1, 4, 2, 3};
        int[] solve = Problem017.solve(a);
        assertThat(solve).containsExactly(6, 4, 3, 2, 1);
    }

    @Test
    void testCase4() {
        int[] a = new int[]{5, 0, 0, 6, 1, 3, 0, 0, 9};
        int[] solve = Problem017.solve(a);
        assertThat(solve).containsExactly(9,6, 5, 3, 1, 0, 0, 0, 0);
    }

}
