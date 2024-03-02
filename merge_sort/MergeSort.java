package merge_sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }
        int midIndex = arrayLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < arrayLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] < rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;

        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}