package main;

import algorithms.search.BinarySearch;
import algorithms.search.InterpolationSearch;
import helpers.FileHelper;

public class Runner {
    public Runner() {
        int keyToFind = 21978;
        FileHelper fileHelper = new FileHelper();
        BinarySearch binarySearch = new BinarySearch();
        InterpolationSearch interpolationSearch = new InterpolationSearch();

        for (int i = 0; i < 20; ++i) {
            binarySearch.recursionDepth = 0;
            interpolationSearch.recursionDepth = 0;
            int []array = fileHelper.readArrayFromFile("array_" + i);
            int index1 = binarySearch.search(array, keyToFind, 0, array.length - 1);
            int index2 = interpolationSearch.search(array, keyToFind, 0, array.length - 1);
            System.out.println("Array #" + i + "  -  " + index1 + ", depth = " + binarySearch.recursionDepth + "  -  " + index2 + ", depth = " + interpolationSearch.recursionDepth);
        }
    }
}
