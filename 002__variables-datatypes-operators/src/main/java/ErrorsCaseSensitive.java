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
   Java чувствительна к регистру символов.

   Compile-time errors. (ќшибки во врем€ компил€ции).

   следующий код не скомпилируетс€, так как модификатор доступа (ключевое слово) public
   а также метод println написаны начина€ с верхнего регистра: Public, Println
*/

public class ErrorsCaseSensitive {

     public static void main(String[] args) {
         System.out.println("Hello, World");
     }
}
