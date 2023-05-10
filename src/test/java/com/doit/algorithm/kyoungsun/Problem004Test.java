package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Problem004Test {

    @Test
    void testCase1() {
        String input =
                "4 3\n" +
                        "1 2 3 4\n" +
                        "2 3 4 5\n" +
                        "3 4 5 6\n" +
                        "4 5 6 7\n" +
                        "2 2 3 4\n" +
                        "3 4 3 4\n" +
                        "1 1 4 4";
        List<Integer> sum = Problem004.sum(input);
        assertThat(sum).containsExactly(27, 6, 64);
    }

    @Test
    void testCase2() {
        String input =
                "2 4\n" +
                        "1 2\n" +
                        "3 4\n" +
                        "1 1 1 1\n" +
                        "1 2 1 2\n" +
                        "2 1 2 1\n" +
                        "2 2 2 2";
        List<Integer> sum = Problem004.sum(input);
        assertThat(sum).containsExactly(1, 2, 3, 4);
    }
}