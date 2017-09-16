package algorithms.sort;

public class MergeSort {
    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (right + left) / 2;

            this.mergeSort(array, left, middle);
            this.mergeSort(array, middle + 1, right);
            this.merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int leftLength  = middle - left + 1;
        int rightLength = right - middle;

        int[] leftArray  = new int[leftLength + 1];
        int[] rightArray = new int[rightLength + 1];

        for (int i = 0; i < leftLength; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightLength; ++i) {
            rightArray[i] = array[middle + i + 1];
        }

        leftArray[leftLength]   = (int) Double.POSITIVE_INFINITY;
        rightArray[rightLength] = (int) Double.POSITIVE_INFINITY;

        int i = 0, j = 0;

        for (int k = left; k <= right; ++k) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                ++i;
            } else {
                array[k] = rightArray[j];
                ++j;
            }
        }
    }
}
