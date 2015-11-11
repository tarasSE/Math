package com.math.algorithms.sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();

        int n = 10;

        int[] array = new int[n];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = array.length - i;
        }

        System.out.println(Arrays.toString(array));

        insertionSort.insertionSort(array);

        System.out.println(Arrays.toString(array));

    }

    public void insertionSort(final int[] array) {

        for (int i=1; i<array.length; i++ ){

            for (int j = i; j>0; j--){

                if (array[j] < array[j-1])swap(array, j);

            }

        }

    }

    private void swap(final  int[] array, int j) {

        int tmp = array[j];

        array[j] = array[j - 1];

        array[j - 1] = tmp;

    }
}
