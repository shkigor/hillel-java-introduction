package academy.learnprogramming;

public class CharBoolean {

    public static void main(String[] args) {

        // =================== char Primitive Data Type ===================
        char symA = 'А'; // символьный литерал, заданный напрямую любым отображаемым символом Unicode
        System.out.println(symA);


        char symB = (char) (symA + 1);
        System.out.println("symB = " + symB);


        char myIntegerCharCode_A = 1040; // код символа Unicode в десятичном исчислении
        char myUnicodeChar_A = '\u0410'; // символ Unicode, где xxxx цифровой код символа Unicode в шестнадцатеричной форме
        char myCopyrightChar = '\u00A9';

        System.out.println("myIntegerCharCode_A = " + myIntegerCharCode_A);
        System.out.println("myUnicodeChar_A = " + myUnicodeChar_A);
        System.out.println("myCopyrightChar = " + myCopyrightChar);

        System.out.println("intCode = " + (int) symA);
        System.out.println("HexString = " + Integer.toHexString((int) symA));
        System.out.println("intCodeOther = " + Character.codePointAt(new char[]{symA}, 0));


        // Управляющие символы
        System.out.println("Строка 1 \n   Строка 2 \nСтрока 3");
        System.out.println("Пример\t\tтабуляции и забоя\b");
        System.out.println("Строка с цитатой: \"Когда тебе тяжело, всегда напоминай себе о том, что если ты сдашься, лучше не станет.\"");


        // =================== boolean Primitive Data Type ===================
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; // is the Question
        System.out.println(isCustomerOverTwentyOne);

    }
}
