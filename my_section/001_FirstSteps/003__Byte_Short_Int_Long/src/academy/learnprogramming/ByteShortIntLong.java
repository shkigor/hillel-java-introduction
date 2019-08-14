package academy.learnprogramming;

public class ByteShortIntLong {

    public static void main(String[] args) {

        // =================== int - primitive type ===================
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow

//        int myMaxIntTest2 = 2147483648; // Error: Integer number is too large
        int myMaxIntTest = 2_147_483_647;


        // =================== byte - primitive type ===================
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);


        // =================== short - primitive type ===================
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        // =================== long - primitive type ===================
        // Internal type casting is done by compiler and int is auto promoted to Long type.
        long myLongValue = 100; // https://stackoverflow.com/questions/769963/javas-l-number-long-specification
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

//        long bigLongLiteralValue2 = 2_147_483_647_234; // Error: Integer number too long
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

//        short bigShortLiteralValue2 = 32768; // Error: Incompatible types
        short bigShortLiteralValue = 32767;


        // =================== Casting in Java ===================
        int myTotal = (myMinIntValue / 2);

//        byte myNewByteValue2 = (myMinByteValue / 2); // Error: Incompatible types
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
