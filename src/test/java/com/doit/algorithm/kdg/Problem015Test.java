package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem015Test {

    @Test
    void bubbleSort() {
        int n = 5;
        int[] numbers = {5, 2, 3, 4, 1};

        int[] result = Problem015.bubbleSort(n, numbers);

        assertThat(result).containsExactly(1, 2, 3, 4 ,5);
    }

    @Test
    void mergeSort_numbers() {
        int n = 5;
        int[] numbers = {5, 2, 3, 4, 1};

        Problem015.mergeSortNumbers(numbers, 0, n - 1);

        assertThat(numbers).containsExactly(1, 2, 3, 4 ,5);
    }

    @Test
    void mergeSort_chars() {
        int n = 5;
        char[] chars = {'A', 'C', 'F', 'Z', 'B'};

        Problem015.mergeSortChars(chars, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(chars[i]);
        }
    }

    @Test
    void quickSort() {
        int n = 5;
        int[] numbers = {5, 2, 3, 4, 1};

        Problem015.quickSort(numbers, 0, n - 1);

        assertThat(numbers).containsExactly(1, 2, 3, 4 ,5);
    }
}
