package academy.learnprogramming;
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
public class TestIntegral {
    public static void main(String[] args) {
        testByte();
        testShort();
        testInt();
        testLong();
    }

    /**
     * Наименьший по размеру целочисленный тип - byte.
     * Это 8-битовый тип с диапазоном допустимых значений от -128 до 127.
     * Переменные типа byte часто используются при работе с потоком данных из сети или файла,
     * а также при работе с необработанными двоичными данными или в массивах для экономии памяти.
     */
    private static void testByte() {
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

    /**
     * Тип short - 16-битовый тип в диапазоне от -32768 до 32767. Используется очень редко.
     */
    private static void testShort() {
        System.out.println("--- testShort method ---");

        // В арифметических выражениях с переменными типа short вычисления выполняются как с типом int,
        // т.е. с помощью 32-битовой арифметики, а полученный результат будет 32-битовым. Например, такой код не пройдёт.
        // накорми кота
        short fishNumber = 3; // три рыбки
        short beefNumber = 2; // два кусочка говядины
        short breakfast = 0;
        // Java будет ругаться, так как итоговый результат не может быть short.
        // breakfast = fishNumber + beefNumber; // завтрак чемпиона

        // Как вариант, вам нужно преобразовать результат снова в 16-битовое число.
        breakfast = (short) (fishNumber + beefNumber); // завтрак чемпиона

        // Строку с числом перевести в данный тип можно через метод parseShort(String):
        // Класс Short является оболочкой для данного типа.
        short x = Short.parseShort("100");
    }

    /**
     * int - это 32-битовый тип, имеющий диапазон допустимых значений от -2147483648 до 2147483647 (около двух миллиардов).
     */
    private static void testInt() {
        System.out.println("--- testInt method ---");
        // Decimal literals (Base 10) : In this form the allowed digits are 0-9.
        int a = 101;

        // в JDK 7 можно вставлять символы подчёркивания для облегчения чтения больших числовых литералов
        int easyRead = 123_456_789;

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
        System.out.println(easyRead);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("\n *** Зададим себе вопрос, насколько большим может быть целое число типа int?");
        int x = 2;
//        int x = 3;
        System.out.println(x);
        x *= x; // x = x * x
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);
        x *= x;
        System.out.println(x);


        // При делении целочисленных чисел остаток отбрасывается
        //        6 / 3 = 2
        //        7 / 3 = 2
        //        8 / 3 = 2
        //        9 / 3 = 3
        System.out.println("\n *** Деление целочисленных чисел");
        System.out.println(6 / 3);
        System.out.println(7 / 3);
        System.out.println(8 / 3);
        System.out.println(9 / 3);

        System.out.println("\n *** Если нужен узнать остаток от деления, то используйте оператор % (оператор деления по модулю)");
        System.out.println(6 % 3);
        System.out.println(7 % 3);
        System.out.println(8 % 3);
        System.out.println(9 % 3);

        // Строку с числом перевести в данный тип можно через метод parseInt(String):
        // Класс Integer является оболочкой для данного типа.
        String mString = "42"; // строка
        int mInt = Integer.parseInt(mString);
    }

    /**
     * Тип long - это 64-битный тип со знаком, используемый в тех случаях, когда используется очень большое значение,
     * которое не способен хранить тип int.
     */
    private static void testLong() {
        System.out.println("--- testLong method ---");

        // Для обозначения числа типа long можно использовать символы l или L
        long night = 101l; // не рекомендуется использовать маленькую букву l, так как ее можно спутать с 1
        long day = 101L;
        System.out.println(night);
        System.out.println(day);

//        long bigLongLiteralValue2 = 2_147_483_647_234; // Error: Integer number too long
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        // If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.
        int intMaxValue = 2147483647; //Integer.MAX_VALUE
        long longValue = 1 + intMaxValue;
//        long longValue = 1L + intMaxValue;
        System.out.println(longValue);
    }

}
