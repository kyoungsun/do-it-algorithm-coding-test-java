package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem006Test {

    @Test
    void solution_1() {
        int n = 15;

        int result = Problem006.solution(n);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solution_2() {
        int n = 10;

        int result = Problem006.solution(n);

        assertThat(result).isEqualTo(2);
    }
}
