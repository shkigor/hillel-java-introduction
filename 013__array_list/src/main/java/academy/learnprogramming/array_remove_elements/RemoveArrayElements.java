package academy.learnprogramming.array_remove_elements;

/*
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
*/

import java.util.Arrays;

public class RemoveArrayElements {

    public static void main(String[] args) {
        int test_array[] = {0, 1, 2, 2, 3, 0, 4, 2};
        /*
            Arrays.toString:
            см. https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
         */
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }

        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длинной nums.length - offset
        return Arrays.copyOf(nums, nums.length - offset);
    }

    // Можно написать метод для «отрезания хвоста» массива и самостоятельно, но стоит отметить,
    // что стандартный метод будет работать быстрее:
    public static int[] removeElement(int[] nums, int val, int own1) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        int[] newArray = new int[nums.length - offset];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = nums[i];
        }
        return newArray;
    }

    // Впрочем, если идти таким путём, то можно сначала создать массив нужной длины, а потом уже заполнить его:
    public static int[] removeElement(int[] nums, int val, int own1, int own2) {
        int count = 0;

        // Сначала вычислим длину нового массива
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int offset = 0;

        // Далее всё как в прошлых решениях,
        // только запись идёт в новый массив
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                newArray[i - offset] = nums[i];
            }
        }

        return newArray;
    }

}
