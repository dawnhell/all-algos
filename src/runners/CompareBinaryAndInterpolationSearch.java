package runners;

import algorithms.search.BinarySearch;
import algorithms.search.InterpolationSearch;
import helpers.FileHelper;

public class CompareBinaryAndInterpolationSearch {
    public CompareBinaryAndInterpolationSearch() {
        int keyToFind = 21978;
        FileHelper fileHelper = new FileHelper();
        BinarySearch binarySearch = new BinarySearch();
        InterpolationSearch interpolationSearch = new InterpolationSearch();

        System.out.println(
            "Comparison of Binary Search and Interpolation search:\n" +
            "-------------------------------------------------------------------------------------------------\n" +
            "| # of array - Binary search - recursion depth --- Interpolation search --- recursion depth |\n"
        );

        for (int i = 0; i < 20; ++i) {
            binarySearch.recursionDepth = 0;
            interpolationSearch.recursionDepth = 0;
            int []array = fileHelper.readArrayFromFile("array_" + i);
            int index1 = binarySearch.search(array, keyToFind, 0, array.length - 1);
            int index2 = interpolationSearch.search(array, keyToFind, 0, array.length - 1);
            System.out.println(
                "| " + i +
                "             " + index1 + (index1 < 1000 ? "      " : "") +
                "                 " + binarySearch.recursionDepth +
                "                 " + index2 + (index2 < 1000 ? "      " : "") +
                "                 " +  interpolationSearch.recursionDepth + "|"
            );
        }
    }
}
