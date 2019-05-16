/*
Значения примитивных типов данных в большинстве случаев инициализируются с помощью литералов.
Типы целочисленных литералов в Java:
 - десятичные
 - восьмеричные
 - шестнадцатеричные
 - двоичные - начиная с Java 7
Все целочисленные литералы представляют значения int.
Если значение литерала лежит в диапазоне byte, short или char, то его можно присвоить переменной этого типа без приведения типов.
Для создания литерала типа long, необходимо явно указать компилятору, дополнив литерал буквой 'l' или 'L'
*/

// Java program to illustrate the application of Integer literals
public class Test {
    public static void main(String[] args) {
        // Decimal literals (Base 10) : In this form the allowed digits are 0-9.
        int a = 101;

        // в JDK 7 можно вставлять символы подчёркивания для облегчения чтения больших числовых литералов
        int x = 123_456_789;

        // Octal literals (Base 8) : In this form the allowed digits are 0-7.
        int b = 0100; // The octal number should be prefix with 0.
        // 1*8^2 + 0*8^1 + 0*8^0

        // Hexa-decimal literals (Base 16) : In this form the allowed digits are 0-9 and characters are a-f.
        int c = 0xFace; // We can use both uppercase and lowercase characters. The hexa-decimal number should be prefix with 0X or 0x.
        // 15*16^3 + 10*16^2 + 12*16^1 + 14*16^0

        // В JDK 7 можно использовать целочисленные литералы в двоичной системе. Для этого нужно использовать префикс 0b или 0B
        int d = 0b1111;
        // 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0

        System.out.println(a);
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        testByte();
    }

    /**
     * Наименьший по размеру целочисленный тип - byte.
     * Это 8-битовый тип с диапазоном допустимых значений от -128 до 127.
     * Переменные типа byte часто используются при работе с потоком данных из сети или файла,
     * а также при работе с необработанными двоичными данными или в массивах для экономии памяти.
     */
    public static void testByte() {
        System.out.println("--- testByte method ---");
        byte byteVar1 = 0, byteVar2 = 1, byteVar3 = 2; // объявили и проинициализировали сразу три переменные
        byte c, a, t; // объявили сразу три переменные
        c = 20;
        a = 30;
        t = 64;
//        byte m = 128; // Ошибка. Выходим за допустимый диапазон.

        // В арифметических выражениях с переменными типа byte вычисления выполняются как с типом int,
        // т.е. с помощью 32-битовой арифметики, а полученный результат будет 32-битовым.
//        byte sumResult = byteVar1 + byteVar2;
        int sumResult = byteVar1 + byteVar2;
        System.out.println("sumResult = " + sumResult);

        // Строку с числом перевести в данный тип можно через метод parseByte(String):
        // Класс Byte является оболочкой для данного типа.
        byte x = Byte.parseByte("100");
        System.out.println(x);

    }
}
