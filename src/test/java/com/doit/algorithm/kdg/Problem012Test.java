package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem012Test {

    @Test
    void solution_1() {
        int n = 4;
        String s = "3 5 2 7";

        String result = Problem012.solution(n, s);

        assertThat(result).isEqualTo("5 7 7 -1");
    }
    @Test
    void solution_2() {
        int n = 4;
        String s = "9 5 4 8";

        String result = Problem012.solution(n, s);

        assertThat(result).isEqualTo("-1 8 8 -1");
    }

}
