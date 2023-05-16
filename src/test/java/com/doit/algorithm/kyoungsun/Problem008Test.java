package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem008Test {
    @Test
    void solution() {
        int N = 10;
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int solution = Problem008.solution(N, A);
        assertThat(solution).isEqualTo(8);
    }
}