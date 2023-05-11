package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem007Test {

    @Test
    void solution_1() {
        int n = 6;
        int m = 9;
        String s = "2 7 4 1 5 3";

        int result = Problem007.solution(n, m, s);

        // {2, 7}, {4, 5}
        assertThat(result).isEqualTo(2);
    }

    @Test
    void solution_2() {
        int n = 4;
        int m = 8;
        String s = "3 5 8 4";

        int result = Problem007.solution(n, m, s);

        // {3, 5}
        assertThat(result).isEqualTo(1);
    }

    @Test
    void solution_3() {
        int n = 9;
        int m = 6;
        String s = "3 5 8 4 6 2 1 9 7";

        int result = Problem007.solution(n, m, s);

        // {5, 1}, {4, 2}
        assertThat(result).isEqualTo(2);
    }
}
