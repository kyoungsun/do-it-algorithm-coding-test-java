package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem015Test {

    @Test
    void sort() {
        int[] sort = Problem015.sort(5, new int[]{5, 2, 3, 4, 1});
        assertThat(sort).containsExactly(1, 2, 3, 4, 5);
    }
}