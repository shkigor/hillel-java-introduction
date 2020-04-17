package academy.learnprogramming.array_sort;

import java.util.Arrays;
import java.util.SplittableRandom;

public class ArrayAlgorithmSortingTime {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100000);

        System.out.println(Arrays.toString(array));
        long startSelectionSort = System.currentTimeMillis();
        selectionSort(array);
        long endSelectionSort = System.currentTimeMillis();
        System.out.println("Selection sorting took " + (endSelectionSort - startSelectionSort));
//        System.out.println(Arrays.toString(array));

        int[] a = generateRandomArray(100000);
        long startQuickSort = System.currentTimeMillis();
        int low = 0;
        int high = a.length - 1;
        quickSort(a, low, high);
        long endQuickSort = System.currentTimeMillis();
        System.out.println("Quick sorting took " + (endQuickSort - startQuickSort));
//        System.out.println(Arrays.toString(array));
    }

    private static int[] generateRandomArray(int count) {
        SplittableRandom random = new SplittableRandom();

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(1, 1001);
            array[i] = randomNumber;
        }
        return array;
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tempValue = array[i];
                array[i] = minValue;
                array[minIndex] = tempValue;
            }

        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }
}
