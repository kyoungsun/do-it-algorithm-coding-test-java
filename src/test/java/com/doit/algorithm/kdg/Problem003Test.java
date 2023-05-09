package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Problem003Test {

    @Test
    void solution_1() {

        // given
        int n = 5;
        int start = 1;
        int end = 3;

        // when
        int result = Problem003.solution(n, start, end);

        // then
        assertThat(result).isEqualTo(12);
    }

    @Test
    void solution_2() {

        // given
        int n = 5;
        int start = 2;
        int end = 4;

        // when
        int result = Problem003.solution(n, start, end);

        // then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void solution_3() {
        // given
        int n = 5;
        int start = 5;
        int end = 5;

        // when
        int result = Problem003.solution(n, start, end);

        // then
        assertThat(result).isEqualTo(1);
    }
}