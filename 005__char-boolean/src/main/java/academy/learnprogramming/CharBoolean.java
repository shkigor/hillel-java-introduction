package academy.learnprogramming;

public class CharBoolean {

    public static void main(String[] args) {

        // =================== char Primitive Data Type ===================
        char symA = '�'; // ���������� �������, �������� �������� ����� ������������ �������� Unicode
        System.out.println(symA);


        char symB = (char) (symA + 1);
        System.out.println("symB = " + symB);


        char myIntegerCharCode_A = 1040; // ��� ������� Unicode � ���������� ����������
        char myUnicodeChar_A = '\u0410'; // ������ Unicode, ��� xxxx �������� ��� ������� Unicode � ����������������� �����
        char myCopyrightChar = '\u00A9';

        System.out.println("myIntegerCharCode_A = " + myIntegerCharCode_A);
        System.out.println("myUnicodeChar_A = " + myUnicodeChar_A);
        System.out.println("myCopyrightChar = " + myCopyrightChar);

        System.out.println("intCode = " + (int) symA);
        System.out.println("HexString = " + Integer.toHexString((int) symA));
        System.out.println("intCodeOther = " + Character.codePointAt(new char[]{symA}, 0));


        // ����������� �������
        System.out.println("������ 1 \n   ������ 2 \n������ 3");
        System.out.println("������\t\t��������� � �����\b");
        System.out.println("������ � �������: \"����� ���� ������, ������ ��������� ���� � ���, ��� ���� �� �������, ����� �� ������.\"");


        // =================== boolean Primitive Data Type ===================
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; // is the Question
        System.out.println(isCustomerOverTwentyOne);

    }
}
