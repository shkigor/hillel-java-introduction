package academy.learnprogramming.prime_numbers;

/*
    Печать простых чисел.

    1. Создайте метод isPrime, который определяет является ли переданное значение простым числом.
    2. Создайте цикл for, используя диапазон целых чисел от 1000 до 1500.
    3. В цикле определите, является ли каждое число простым числом, используя метод isPrime().
       Если это простое число, выведите его в консоль и увеличьте счетчик найденных простых чисел
    4. Если значение счетчика будет равно 3, выйдите из цикла for
*/

public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 1500; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    /**
     * Метод, который определяет является ли переданное значение простым числом
     * <br>
     * Просто́е число́ — натуральное (целое положительное) число,
     * имеющее ровно два различных натуральных делителя — единицу и самого себя
     *
     * @param number число для проверки
     * @return true - если число простое, false - если число составное
     */
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
//        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
//            System.out.println("Looping " + i + " for number " + number);
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
