/******************************************************************************
 *  Compilation:  javac ErrorsCaseSensitive.java
 *  Execution:    java ErrorsCaseSensitive
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java ErrorsCaseSensitive
 *  ./ErrorsCaseSensitive.java:18: error: class, interface, or enum expected
 *  Public class HelloWorld {
 *  ^
 *  1 error
 *
 ******************************************************************************/


/*
   Java ������������� � �������� ��������.

   Compile-time errors. (������ �� ����� ����������).

   ��������� ��� �� ��������������, ��� ��� ����������� ������� (�������� �����) public
   � ����� ����� println �������� ������� � �������� ��������: Public, Println
*/

public class ErrorsCaseSensitive {

     public static void main(String[] args) {
         System.out.println("Hello, World");
     }
}
