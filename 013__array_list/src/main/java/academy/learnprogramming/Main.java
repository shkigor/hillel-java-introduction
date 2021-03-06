package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[25];
        int[] myIntArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myIntArray[0] = 45;
        myIntArray[1] = 345;
        myIntArray[5] = 67;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);


        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
        System.out.println("Sort array");
        selectionSort();

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values.\r");
        int[] values = new int[capacity];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;

    }

    public static void selectionSort() {
        int[] a = new int[] {1, 4, 2, 5, 5, -1, 7, 2, 9, 0};
        printArray(a);
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
        printArray(a);
    }
}
