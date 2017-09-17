package algorithms.sort;

public class QuickWithInsertionSort {
    private int boundaryNumberOfElements = 50;

    public void quickWithInsertionSort(int[] array, int left, int right) {
        if (right - left < this.boundaryNumberOfElements) {
            this.insertionSort(array, left, right);
        } else {
            if (left < right) {
                int q = partition(array, left, right);

                this.quickWithInsertionSort(array, left, q - 1);
                this.quickWithInsertionSort(array, q + 1, right);
            }
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

    private void insertionSort(int[] array, int left, int right) {
        int current, j;

        for (int i = left + 1; i <= right; ++i) {
            current = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = current;
        }
    }
}
