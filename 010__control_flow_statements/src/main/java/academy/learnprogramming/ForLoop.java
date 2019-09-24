package academy.learnprogramming;

import java.util.Locale;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }


//        Используя оператор for, вызовите метод calcInterest с
//        суммой 10000 и процентной ставкой 2,3,4,5,6,7 и 8.
//        Выведите результат в консоль.


        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//            System.out.printf(Locale.ENGLISH, "10,000 at %d%% interest = %.2f%n", i, calculateInterest(10000.0, i));
        }

        System.out.println("****************");


//        Как бы вы изменили цикл for выше, чтобы вывод начился с 8% и завершался 2%


        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

//    Создайте цикл for, используя любой на ваш взгляд диапазон целых чисел
//    В цикле определите, является ли каждое число простым числом, используя метод isPrime().
//    Если это простое число, выведите его и увеличьте счетчик найденных простых чисел
//    Если значение счетчика будет равно 3, выйдите из цикла for
//    Подсказка: используйте команду break;

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
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

    /**
     * Метод вычисления суммы дохода (начисленных процентов)
     *
     * @param amount       сумма
     * @param interestRate процентная ставка
     * @return сумма дохода (выплаченных процентов)
     */
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
