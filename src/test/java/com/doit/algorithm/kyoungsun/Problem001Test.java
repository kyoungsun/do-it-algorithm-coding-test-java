package com.doit.algorithm.kyoungsun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem001Test {

    @Test
    void testCase1() {
        // Given
        int length = 1;
        String numbers = "1";
        // When
        int sum = Problem001.sum(length, numbers);
        // Then
        assertThat(sum).isEqualTo(1);
    }

    @Test
    void testCase2() {
        // Given
        int length = 5;
        String numbers = "54321";
        // When
        int sum = Problem001.sum(length, numbers);
        // Then
        assertThat(sum).isEqualTo(15);
    }

    @Test
    void testCase3() {
        // Given
        int length = 25;
        String numbers = "7000000000000000000000000";
        // When
        int sum = Problem001.sum(length, numbers);
        // Then
        assertThat(sum).isEqualTo(7);
    }

    @Test
    void testCase4() {
        // Given
        int length = 11;
        String numbers = "10987654321";
        // When
        int sum = Problem001.sum(length, numbers);
        // Then
        assertThat(sum).isEqualTo(46);
    }
}