package main;

import algorithms.sort.InsertionSort;
import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;
import algorithms.sort.QuickWithInsertionSort;

public class Runner {
    public Runner() {
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        QuickWithInsertionSort quickWithInsertionSort = new QuickWithInsertionSort();

        int[] arr = new RandomGenerator(10).getArray();

        long startTime = System.currentTimeMillis();

//        insertionSort.insertionSort(arr);
//        mergeSort.mergeSort(arr, 0, arr.length - 1);
//        quickSort.quickSort(arr, 0, arr.length - 1);
        quickWithInsertionSort.quickWithInsertionSort(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis();

        System.out.println("\nTotal time spent: " + (endTime - startTime) + " ms.");
    }
}
