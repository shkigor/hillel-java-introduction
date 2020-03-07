package academy.learnprogramming.recursion;

public class MethodRecursion {

    public static void main(String[] args) {
        countDown(10);
        int x = 4;

        int factorial = factorial(x);
        System.out.println();
        System.out.println("Факториал от " + x + " = " + factorial);

        int digits = 5456;
        int sumDigits = sumDigits(digits);
        System.out.println("Sum digits of " + digits + " = " + sumDigits);

        int[] arr = {3, 5, 7, 9, -8};
        System.out.println("Sum of array elements = " + sumArray(arr));
        System.out.println("Max value of array elements = " + findMax(arr));
    }

    private static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        return lastDigit + sumDigits(n / 10);
    }

    private static int sumArray(int[] arr) {
        return sumArray(arr, 0);
    }

    private static int sumArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sumArray(arr, index + 1);
    }

//    private static int sumArray(int[] arr, int lastIndex) {
//        if (lastIndex == 0) {
//            return arr[lastIndex];
//        }
//        return arr[lastIndex] + sumArray(arr, lastIndex - 1);
//    }

    private static int findMax(int[] arr) {
        return findMax(arr, 0);
    }

    private static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    private static void countDown(int i) {
        if (i == 0) {
            return;
        }
        System.out.print(i + "  ");
        countDown(i - 1);
    }

}
