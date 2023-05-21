package com.doit.algorithm.kdg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input 		 	  = Integer.parseInt(reader.readLine());
        int[] result		  = new int [input];

        for (int i = 0; i < input; i++) {
            result[i] = Integer.parseInt(reader.readLine());
        }

        quickSort(result, 0, input - 1);

        for (int i = 0; i < input; i++) {
            System.out.println(result[i]);
        }
    }

    public static void mergeSort(int[] numbers, int start, int end) {
        if (start == end) return;

        int mid = (start + end) / 2;
        mergeSort(numbers, start, mid);
        mergeSort(numbers, mid + 1, end);

        int[] temp = new int[end - start + 1];
        int idx = 0;
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            temp[idx++] = numbers[left] <= numbers[right] ? numbers[left++] : numbers[right++];
        }

        while (left <= mid) temp[idx++] = numbers[left++];
        while (right <= end) temp[idx++] = numbers[right++];

        for (int i = start; i <= end; i++) {
            numbers[i] = temp[i - start];
        }
    }

    private static void quickSort(int[] numbers, int left, int right) {
        if (left >= right) return;

        int mid = partition(numbers, left, right);
        quickSort(numbers, left, mid - 1);
        quickSort(numbers, mid + 1, right);
    }

    private static int partition(int[] numbers, int left, int right) {
        int pivot = numbers[(left + right) / 2];

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
