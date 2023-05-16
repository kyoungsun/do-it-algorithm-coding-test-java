package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem007Test {

    @Test
    void testCase1() {
        int N = 6;
        int M = 9;
        int[] ingredients = {2, 7, 4, 1, 5, 3};
        int solution = Problem007.solution(N, M, ingredients);
        assertThat(solution).isEqualTo(2);
    }
}