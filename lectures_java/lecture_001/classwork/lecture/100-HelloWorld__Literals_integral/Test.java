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
public class Test {
    public static void main(String[] args) {
        // Decimal literals (Base 10) : In this form the allowed digits are 0-9.
        int a = 101;

        // � JDK 7 ����� ��������� ������� ������������� ��� ���������� ������ ������� �������� ���������
        int x = 123_456_789;

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
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        testByte();
    }

    /**
     * ���������� �� ������� ������������� ��� - byte.
     * ��� 8-������� ��� � ���������� ���������� �������� �� -128 �� 127.
     * ���������� ���� byte ����� ������������ ��� ������ � ������� ������ �� ���� ��� �����,
     * � ����� ��� ������ � ��������������� ��������� ������� ��� � �������� ��� �������� ������.
     */
    public static void testByte() {
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
}
