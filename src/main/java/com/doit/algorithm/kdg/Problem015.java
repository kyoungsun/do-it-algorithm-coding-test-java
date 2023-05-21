package com.doit.algorithm.kdg;


public class Problem015 {

    public static int[] bubbleSort(int n, int[] numbers) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void mergeSortNumbers(int[] numbers, int start, int end) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSortNumbers(numbers, start, mid);
        mergeSortNumbers(numbers, mid + 1, end);

        int[] temp = new int[end - start + 1];
        int idx = 0;
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            temp[idx++] = numbers[left] <= numbers[right] ? numbers[left++] : numbers[right++];
        }

        while (left <= mid) {
            temp[idx++] = numbers[left++];
        }
        while (right <= end) {
            temp[idx++] = numbers[right++];;
        }

        for (int i = start; i <= end; i++) {
            numbers[i] = temp[i - start];
        }
    }

    public static void mergeSortChars(char[] chars, int start, int end) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSortChars(chars, start, mid);
        mergeSortChars(chars, mid + 1, end);

        char[] temp = new char[end - start + 1];
        int idx = 0;
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            temp[idx++] = chars[left] <= chars[right]? chars[left++] : chars[right++];
        }

        while (left <= mid) {
            temp[idx++] = chars[left++];
        }

        while (right <= end) {
            temp[idx++] = chars[right++];
        }

        for (int i = start; i <= end; i++) {
            chars[i] = temp[i - start];
        }
    }

    public static void quickSort(int[] numbers, int left, int right) {
        if (left >= right) return;

        int mid = partition(numbers, left, right);
        quickSort(numbers, left, mid - 1);
        quickSort(numbers, mid + 1, right);
    }

    private static int partition(int[] numbers, int left, int right) {
        int pivot = numbers[left + right / 2];

        while (left <= right) {
            while (numbers[left] < pivot) left++;
            while (numbers[right] > pivot) right--;

            if (left <= right) {
                swap(numbers, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
