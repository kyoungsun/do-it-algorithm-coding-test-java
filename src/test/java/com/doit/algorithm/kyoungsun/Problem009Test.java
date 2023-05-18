package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem009Test {

    @Test
    void testCase1() {
        String input = "9 8\nCCTGGATTG\n2 0 1 1";
        int solution = Problem009.solution(input);
        assertThat(solution).isEqualTo(0);
    }

    @Test
    void testCase2() {
        String input = "4 2\nGATA\n1 0 0 1";
        int solution = Problem009.solution(input);
        assertThat(solution).isEqualTo(2);
    }
}