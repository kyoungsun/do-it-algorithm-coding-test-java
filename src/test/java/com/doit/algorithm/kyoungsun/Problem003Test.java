package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Problem003Test {

    @Test
    void sum() {
        // given
        final int dataCount = 5;
        final String date = "5 4 3 2 1";
        final String[] sections = {"1 3", "2 4", "5 5", "1 1", "1 5"};
        // when
        List<Integer> sum = Problem003.sum(dataCount, date, List.of(sections));
        // then
        assertThat(sum).containsExactly(12, 9, 1, 5, 15);
    }
}