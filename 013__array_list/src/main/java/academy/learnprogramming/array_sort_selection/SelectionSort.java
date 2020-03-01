package academy.learnprogramming.array_sort_selection;

import java.util.Arrays;
import java.util.SplittableRandom;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] a = new int[] {1, 4, 2, 5, 5, -1, 7, 2, 9, 0};
        // РЕАЛИЗАЦИЯ С ИСПОЛЬЗОВАНИЕМ ДОП. МАССИВА
        int[] a = new int[10000];
        fillArray(a);
//        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();
        int[] sortedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int smallest = findSmallest(a);
            sortedArray[i] = smallest;
        }
        long end = System.currentTimeMillis();
        System.out.println("Время сортировки - " + (end - start));
//        System.out.println(Arrays.toString(sortedArray));
//        System.out.println(Arrays.toString(a));
    }

    private static void fillArray(int[] arr) {
        SplittableRandom random = new SplittableRandom();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-1000, 10001);
        }

    }

    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        array[smallestIndex] = Integer.MAX_VALUE;
        return smallest;
    }

    public static void selectionSort() {
        int[] a = new int[] {1, 4, 2, 5, 5, -1, 7, 2, 9, 0};
        for (int i = 0; i < a.length; i++) {
            int minValue = a[i];
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minValue) {
                    minValue = a[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = minValue;
                a[minIndex] = temp;
            }
        }
        System.out.println();
    }

}
