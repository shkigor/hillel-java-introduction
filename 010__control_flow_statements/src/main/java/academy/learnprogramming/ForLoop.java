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


        // Используя оператор for, вызовите метод calcInterest с
        // суммой 10000 и процентной ставкой 2, 3, 4, 5, 6, 7, 8.
        // Выведите результат в консоль.

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

        System.out.println("WHILE LOOP");
        int i = 2;
        while (i < 9) {
            i++;
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

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
