package org.example.algorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortAlg {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        int lenght = numbers.length;

        for (int i = 0; i < lenght - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < lenght; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }


    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
