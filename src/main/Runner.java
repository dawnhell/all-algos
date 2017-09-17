package main;

import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;

public class Runner {
    public Runner() {
//        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        int[] arr = new RandomGenerator(10).getArray();

        long startTime = System.currentTimeMillis();

//        mergeSort.mergeSort(arr, 0, arr.length - 1);
        quickSort.quickSort(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTotal time spent: " + (endTime - startTime) + " ms.");
    }
}
