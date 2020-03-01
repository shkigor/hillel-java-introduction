package academy.learnprogramming.array_binary_search;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] myList = {1, 3, 5, 7, 9};
        int[] myList = {-5, -1, 0, 2, 13, 44, 70, 81, 95};
        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }

    public static int binarySearch(int[] list, int item) {
        int low = 0, high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
