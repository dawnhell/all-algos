package algorithms.sort;

public class InsertionSort {
    public int[] insertionSort(int[] array) {
        int current, j;

        for (int i = 1; i < array.length; ++i) {
            current = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = current;
        }

        return array;
    }
}
