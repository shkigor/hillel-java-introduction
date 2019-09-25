package academy.learnprogramming.sum_odd;

/*
    Суммирование нечетных чисел из диапазона.

    1. Создайте метод isOdd с параметром number и типом int.
       Метод должен возвращать true если переданное число нечетное и false в противном случае.
    2. Создайте метод sumOdd с параметрами start и end (тип int).
       Метод должен использовать цикл for для суммирования всех нечетных чисел
       в переданном диапазоне (включая проверку последнего числа из диапазона) и возвращать сумму нечетных чисел.
       В методе необходимо вызывать метод isOdd() для проверки является ли число нечетным.

       Параметр end должен быть больше или равен start.
       Оба параметра start и end должны быть болше 0.
       Если эти условия не выполняются, метод должен возвращать -1.
    3. В методе main выведите в консоль результы для
       sumOdd(1, 100); → должен вернуть 2500
       sumOdd(-1, 100); → должен вернуть -1
       sumOdd(100, 100); → должен вернуть 0
       sumOdd(13, 13); → должен вернуть 13
       sumOdd(100, -100); → должен вернуть -1
       sumOdd(100, 1000); → должен вернуть 247500
*/

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
