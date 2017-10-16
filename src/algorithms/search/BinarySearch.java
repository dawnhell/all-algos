package algorithms.search;

public class BinarySearch {
    public int recursionDepth = 0;

    public int search(int []array, int key, int left, int right) {
        ++this.recursionDepth;

        if (left < right) {
            int middle = left + (right - left) / 2;
            if (key < array[middle]) {
                return search(array, key, left, middle);
            } else {
                if (key > array[middle]) {
                    return search(array, key, middle + 1, right);
                } else {
                    return middle;
                }
            }
        }

        return -1;
    }
}
