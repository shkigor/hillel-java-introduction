/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  ./HelloWorld.java:18: error: class, interface, or enum expected
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

Public class HelloWorld {

     public static void main(String[] args) {
         System.out.Println("Hello, World");
     }
}
