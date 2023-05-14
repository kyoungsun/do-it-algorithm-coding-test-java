package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem006Test {

    @Test
    void testCase1() {
        int N = 15;
        int solution = Problem006.solution(N);
        assertThat(solution).isEqualTo(4);
    }

    @Test
    void testCase2() {
        int N = 10;
        int solution = Problem006.solution(N);
        assertThat(solution).isEqualTo(2);
    }

    @Test
    void testCase3() {
        int N = 1;
        int solution = Problem006.solution(N);
        assertThat(solution).isEqualTo(1);
    }
}