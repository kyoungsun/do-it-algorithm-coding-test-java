package com.doit.algorithm.kdg.problem001;

import com.doit.algorithm.kdg.Problem001;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem001Test {

    @Test
    @DisplayName("for 1")
    void solution1_1() {

        // given
        int length = 5;
        String s = "54321";

        // when
        int result = Problem001.solution1(length, s);

        // then
        assertThat(result).isEqualTo(15);
    }

    @Test
    @DisplayName("for 2")
    void solution1_2() {

        // given
        int length = 25;
        String s = "7000000000000000000000000";

        // when
        int result = Problem001.solution1(length, s);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("for 3")
    void solution1_3() {

        // given
        int length = 11;
        String s = "10987654321";

        // when
        int result = Problem001.solution1(length, s);

        // then
        assertThat(result).isEqualTo(46);
    }

    @Test
    @DisplayName("forEach 1")
    void solution2_1() {

        // given
        String s = "54321";

        // when
        int result = Problem001.solution2(s);

        // then
        assertThat(result).isEqualTo(15);
    }

    @Test
    @DisplayName("forEach 2")
    void solution2_2() {

        // given
        String s = "7000000000000000000000000";

        // when
        int result = Problem001.solution2(s);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("forEach 3")
    void solution2_3() {

        // given
        String s = "10987654321";

        // when
        int result = Problem001.solution2(s);

        // then
        assertThat(result).isEqualTo(46);
    }

    @Test
    @DisplayName("IntStream 1")
    void solution3_1() {

        // given
        String s = "54321";

        // when
        int result = Problem001.solution3(s);

        // then
        assertThat(result).isEqualTo(15);
    }

    @Test
    @DisplayName("IntStream 2")
    void solution3_2() {

        // given
        String s = "7000000000000000000000000";

        // when
        int result = Problem001.solution3(s);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("IntStream 3")
    void solution3_3() {

        // given
        String s = "10987654321";

        // when
        int result = Problem001.solution3(s);

        // then
        assertThat(result).isEqualTo(46);
    }
}
