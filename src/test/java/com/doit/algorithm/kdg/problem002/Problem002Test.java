package com.doit.algorithm.kdg.problem002;

import com.doit.algorithm.kdg.Problem002;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class Problem002Test {

    @Test
    @DisplayName("예제 1")
    void solution1_1() {

        // given
        int n = 3;
        int[] scores = {40, 80, 60};

        // when
        double result = Problem002.solution(n, scores);

        // then
        assertThat(result).isEqualTo(75.0);
    }

    @Test
    @DisplayName("예제 2")
    void solution1_2() {

        // given
        int n = 3;
        int[] scores = {10, 20, 30};

        // when
        double result = Problem002.solution(n, scores);

        // then
        assertThat(result).isEqualTo(66.66666666666667);
    }

    @Test
    @DisplayName("예제 3")
    void solution1_3() {

        // given
        int n = 4;
        int[] scores = {1, 100, 100, 100};

        // when
        double result = Problem002.solution(n, scores);

        // then
        assertThat(result).isEqualTo(75.25);
    }

    @Test
    @DisplayName("예제 4")
    void solution1_4() {

        // given
        int n = 5;
        int[] scores = {1, 2, 4, 8, 16};

        // when
        double result = Problem002.solution(n, scores);

        // then
        assertThat(result).isEqualTo(38.75);
    }

    @Test
    @DisplayName("예제 5")
    void solution1_5() {

        // given
        int n = 2;
        int[] scores = {3, 10};

        // when
        double result = Problem002.solution(n, scores);

        // then
        assertThat(result).isEqualTo(65.0);
    }

    @Test
    @DisplayName("최댓값 구하기")
    void findMax() {

        // given
        int n = 2;
        int[] scores = {3, 10};

        // when
        int result = Problem002.findMax(n, scores);

        // then
        assertThat(result).isEqualTo(10);
    }
}
