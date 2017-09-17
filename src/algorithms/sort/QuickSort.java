package algorithms.sort;

public class QuickSort {
    public void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int q = partition(array, left, right);

            this.quickSort(array, left, q - 1);
            this.quickSort(array, q + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; ++j) {
            if (array[j] <= pivot) {
                ++i;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;

        return i + 1;
    }
}
