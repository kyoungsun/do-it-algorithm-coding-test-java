package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem008Test {

    @Test
    void solution_1() {
        int n = 10;
        String s = "1 2 3 4 5 6 7 8 9 10";

        int result = Problem008.solution(n, s);

        assertThat(result).isEqualTo(8);
    }

    @Test
    void solution_2() {
        int n = 11;
        String s = "0 1 2 3 4 5 6 7 8 9 10";

        int result = Problem008.solution(n, s);

        assertThat(result).isEqualTo(8);
    }

    @Test
    void solution_3() {
        int n = 6;
        String s = "0 0 3 3 3 3";

        int result = Problem008.solution(n, s);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solution_4() {
        int n = 5;
        String s = "0 0 2 2 2";

        int result = Problem008.solution(n, s);

        assertThat(result).isEqualTo(3);
    }
}
