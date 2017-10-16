package algorithms.search;

public class InterpolationSearch {
    public int recursionDepth = 0;

    public int search(int []array, int key, int left, int right) {
        ++this.recursionDepth;

        if (key > array[left] && key < array[right]) {
            int middle = left + (int)((key - array[left]) * ((right - left + .0) / (array[right] - array[left])));

            if (array[middle] < key) {
                return search(array, key, middle + 1, right);
            } else {
                if (key < array[middle]) {
                    return search(array, key, left, middle - 1);
                } else {
                    return middle;
                }
            }
        }

        if (key == array[left]) {
            return left;
        } else {
            return -1;
        }
    }
}
