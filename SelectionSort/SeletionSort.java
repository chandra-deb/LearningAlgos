package SelectionSort;

import java.util.Arrays;

public class SeletionSort {
    public static void main(String[] args) {

        int[] array = { 8, 3, 5, 2, 9 };
        // int[] sortedArray = {};
        System.out.println(Arrays.toString(array));

        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int newMinIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[newMinIndex] > array[j]) {
                    newMinIndex = j;
                }

            }
            int tempValue = array[newMinIndex];
            array[newMinIndex] = array[i];
            array[i] = tempValue;

        }

        System.out.println(Arrays.toString(array));

    }
}
