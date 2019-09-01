package academy.learnprogramming;

/**
 * https://stackoverflow.com/questions/1293819/why-does-java-implicitly-without-cast-convert-a-long-to-a-float
 */
public class TestConversation {

    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        //automatic type conversion

        byte byteVal = 100;
        short shortVal = byteVal;
        int intVal = shortVal;
//        int intVal = Integer.MAX_VALUE;
        long longVal = Long.MAX_VALUE;
        float floatVal = longVal;
        double doubleVal = floatVal;

        System.out.println("Byte value " + byteVal);
        System.out.println("Short value " + shortVal);
        System.out.println("Int value " + intVal);
        System.out.println("Long value " + longVal);
        System.out.println("Float value " + floatVal);
        System.out.println("Double value " + doubleVal);

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
