package academy.learnprogramming;

/**
 * https://stackoverflow.com/questions/1293819/why-does-java-implicitly-without-cast-convert-a-long-to-a-float
 */
public class TestConversation {

    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        //automatic type conversion

        byte _byte = 100;
        short _short = _byte;
        int _int = _short;
//        int _int = Integer.MAX_VALUE;
        long _long = _int;
        float _float = _long;
        double _double = _float;

        System.out.println("Byte value " + _byte);
        System.out.println("Short value " + _short);
        System.out.println("Int value " + _int);
        System.out.println("Long value " + _long);
        System.out.println("Float value " + _float);
        System.out.println("Double value " + _double);

        //Java program to illustrate Conversion of int and double to byte
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("Conversion of int to byte.");

        //i%256
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion of double to byte.");

        //d%256
        b = (byte) d;
        System.out.println("d = " + d + " b= " + b);


        // Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        // If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.
        int intMaxValue = 2147483647; //Integer.MAX_VALUE
        long longValue = 1 + intMaxValue;
//        long longValue = 1L + intMaxValue;
        System.out.println(longValue);

    }
}
