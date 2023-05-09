package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class Problem002Test {

    @Test
    void testCase1() {
        int[] numbers = {40, 80, 60};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(75.0);
    }

    @Test
    void testCase2() {
        int[] numbers = {10, 20, 30};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(66.666667, withPrecision(0.01));
    }

    @Test
    void testCase3() {
        int[] numbers = {1, 100, 100, 100};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(75.25);
    }

    @Test
    void testCase4() {
        int[] numbers = {1, 2, 4, 8, 16};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(38.75);
    }

    @Test
    void testCase5() {
        int[] numbers = {3, 10};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(65.0);
    }

    @Test
    void testCase6() {
        int[] numbers = {10, 20, 0, 100};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(32.5);
    }

    @Test
    void testCase7() {
        int[] numbers = {50};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(100.0);
    }

    @Test
    void testCase8() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        double average = Problem002.average(numbers);
        assertThat(average).isEqualTo(55.55555555555556);
    }

}