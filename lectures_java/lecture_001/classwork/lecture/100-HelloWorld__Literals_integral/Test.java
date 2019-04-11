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
	public static void main(String[] args) 
	{ 
		// Decimal literals (Base 10) : In this form the allowed digits are 0-9.
		int a = 101;

		// � JDK 7 ����� ��������� ������� ������������� ��� ���������� ������ ������� �������� ���������
		int x = 123_456_789;
		
		// Octal literals (Base 8) : In this form the allowed digits are 0-7.
		int b = 0100; // The octal number should be prefix with 0.

		// Hexa-decimal literals (Base 16) : In this form the allowed digits are 0-9 and characters are a-f.
		int c = 0xFace; // We can use both uppercase and lowercase characters. The hexa-decimal number should be prefix with 0X or 0x.

		// � JDK 7 ����� ������������ ������������� �������� � �������� �������. ��� ����� ����� ������������ ������� 0b ��� 0B
		int d = 0b1111;

		System.out.println(a); 
		System.out.println(x); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
	} 
} 
