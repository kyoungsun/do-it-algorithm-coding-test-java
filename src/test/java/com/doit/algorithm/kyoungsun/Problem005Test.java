package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem005Test {

    @Test
    void main() {
        int N = 5;
        int M = 3;
        int[] A = {1, 2, 3, 1, 2};
        int solution = Problem005.solution(N, M, A);
        assertThat(solution).isEqualTo(7);
    }
}