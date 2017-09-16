package main;

import java.util.Random;

public class RandomGenerator {
    private int[] _array;
    private int MAX_ELEMENT = 1000000;

    public RandomGenerator(int numberOfElements) {
        this._array = new int[numberOfElements];
        Random random = new Random();

        for (int i = 0; i < numberOfElements; ++i) {
            _array[i] = -this.MAX_ELEMENT + random.nextInt(2 * this.MAX_ELEMENT);
        }
    }

    public int[] getArray() {
        return this._array;
    }
}
