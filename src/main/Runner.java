package main;

import algorithms.sort.MergeSort;

public class Runner {
    public Runner() {
        int[] arr = new RandomGenerator(100).getArray();
        MergeSort mergeSort = new MergeSort();

        long startTime = System.currentTimeMillis();

        mergeSort.mergeSort(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal time spent: " + (endTime - startTime) + " ms.");
    }
}
