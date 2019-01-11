package com.algorithm.guide;

public class SelectionSort {


    public int[] selectionSort(int[] array) {
        int min;
        int temp;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
