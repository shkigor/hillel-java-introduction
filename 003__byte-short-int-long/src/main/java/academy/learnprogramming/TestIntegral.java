package academy.learnprogramming;
/*
�������� ����������� ����� ������ � ����������� ������� ���������������� � ������� ���������.
���� ������������� ��������� � Java:
 - ����������
 - ������������
 - �����������������
 - �������� - ������� � Java 7
��� ������������� �������� ������������ �������� int.
���� �������� �������� ����� � ��������� byte, short ��� char, �� ��� ����� ��������� ���������� ����� ���� ��� ���������� �����.
��� �������� �������� ���� long, ���������� ���� ������� �����������, �������� ������� ������ 'l' ��� 'L'
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
     * ���������� �� ������� ������������� ��� - byte.
     * ��� 8-������� ��� � ���������� ���������� �������� �� -128 �� 127.
     * ���������� ���� byte ����� ������������ ��� ������ � ������� ������ �� ���� ��� �����,
     * � ����� ��� ������ � ��������������� ��������� ������� ��� � �������� ��� �������� ������.
     */
    private static void testByte() {
        System.out.println("--- testByte method ---");

        byte byteVar1 = 0, byteVar2 = 1, byteVar3 = 2; // �������� � ������������������� ����� ��� ����������
        byte c, a, t; // �������� ����� ��� ����������
        c = 20;
        a = 30;
        t = 64;
//        byte m = 128; // ������. ������� �� ���������� ��������.

        // � �������������� ���������� � ����������� ���� byte ���������� ����������� ��� � ����� int,
        // �.�. � ������� 32-������� ����������, � ���������� ��������� ����� 32-�������.
//        byte sumResult = byteVar1 + byteVar2;
        int sumResult = byteVar1 + byteVar2;
        System.out.println("sumResult = " + sumResult);

        // ������ � ������ ��������� � ������ ��� ����� ����� ����� parseByte(String):
        // ����� Byte �������� ��������� ��� ������� ����.
        byte x = Byte.parseByte("100");
        System.out.println(x);

    }

    /**
     * ��� short - 16-������� ��� � ��������� �� -32768 �� 32767. ������������ ����� �����.
     */
    private static void testShort() {
        System.out.println("--- testShort method ---");

        // � �������������� ���������� � ����������� ���� short ���������� ����������� ��� � ����� int,
        // �.�. � ������� 32-������� ����������, � ���������� ��������� ����� 32-�������. ��������, ����� ��� �� ������.
        // ������� ����
        short fishNumber = 3; // ��� �����
        short beefNumber = 2; // ��� ������� ��������
        short breakfast = 0;
        // Java ����� ��������, ��� ��� �������� ��������� �� ����� ���� short.
        // breakfast = fishNumber + beefNumber; // ������� ��������

        // ��� �������, ��� ����� ������������� ��������� ����� � 16-������� �����.
        breakfast = (short) (fishNumber + beefNumber); // ������� ��������

        // ������ � ������ ��������� � ������ ��� ����� ����� ����� parseShort(String):
        // ����� Short �������� ��������� ��� ������� ����.
        short x = Short.parseShort("100");
    }

    /**
     * int - ��� 32-������� ���, ������� �������� ���������� �������� �� -2147483648 �� 2147483647 (����� ���� ����������).
     */
    private static void testInt() {
        System.out.println("--- testInt method ---");
        // Decimal literals (Base 10) : In this form the allowed digits are 0-9.
        int a = 101;

        // � JDK 7 ����� ��������� ������� ������������� ��� ���������� ������ ������� �������� ���������
        int easyRead = 123_456_789;

        // Octal literals (Base 8) : In this form the allowed digits are 0-7.
        int b = 0100; // The octal number should be prefix with 0.
        // 1*8^2 + 0*8^1 + 0*8^0

        // Hexa-decimal literals (Base 16) : In this form the allowed digits are 0-9 and characters are a-f.
        int c = 0xFace; // We can use both uppercase and lowercase characters. The hexa-decimal number should be prefix with 0X or 0x.
        // 15*16^3 + 10*16^2 + 12*16^1 + 14*16^0

        // � JDK 7 ����� ������������ ������������� �������� � �������� �������. ��� ����� ����� ������������ ������� 0b ��� 0B
        int d = 0b1111;
        // 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0

        System.out.println(a);
        System.out.println(easyRead);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("\n *** ������� ���� ������, ��������� ������� ����� ���� ����� ����� ���� int?");
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


        // ��� ������� ������������� ����� ������� �������������
        //        6 / 3 = 2
        //        7 / 3 = 2
        //        8 / 3 = 2
        //        9 / 3 = 3
        System.out.println("\n *** ������� ������������� �����");
        System.out.println(6 / 3);
        System.out.println(7 / 3);
        System.out.println(8 / 3);
        System.out.println(9 / 3);

        System.out.println("\n *** ���� ����� ������ ������� �� �������, �� ����������� �������� % (�������� ������� �� ������)");
        System.out.println(6 % 3);
        System.out.println(7 % 3);
        System.out.println(8 % 3);
        System.out.println(9 % 3);

        // ������ � ������ ��������� � ������ ��� ����� ����� ����� parseInt(String):
        // ����� Integer �������� ��������� ��� ������� ����.
        String mString = "42"; // ������
        int mInt = Integer.parseInt(mString);
    }

    /**
     * ��� long - ��� 64-������ ��� �� ������, ������������ � ��� �������, ����� ������������ ����� ������� ��������,
     * ������� �� �������� ������� ��� int.
     */
    private static void testLong() {
        System.out.println("--- testLong method ---");

        // ��� ����������� ����� ���� long ����� ������������ ������� l ��� L
        long night = 101l; // �� ������������� ������������ ��������� ����� l, ��� ��� �� ����� ������� � 1
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
