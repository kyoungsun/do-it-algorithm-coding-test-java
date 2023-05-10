package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem004Test {

    @Test
    void solution_1() {

        // given
        int n = 4;
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;

        // when
        int result = Problem004.solution(n, x1, y1, x2, y2);

        // then
        assertThat(result).isEqualTo(27);
    }

    @Test
    void solution_2() {

        // given
        int n = 4;
        int x1 = 3;
        int y1 = 4;
        int x2 = 3;
        int y2 = 4;

        // when
        int result = Problem004.solution(n, x1, y1, x2, y2);

        // then
        assertThat(result).isEqualTo(6);
    }

    @Test
    void solution_3() {

        // given
        int n = 4;
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;

        // when
        int result = Problem004.solution(n, x1, y1, x2, y2);

        // then
        assertThat(result).isEqualTo(64);
    }
}
