package main;

import algorithms.sort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 1, 6, 3, 663};

        arr = new InsertionSort().insertionSort(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
