/*
  Run-time error. Ошибки во время выполнения. Деление на ноль
*/

/******************************************************************************
 *  Compilation:  javac ErrorsDivideByZero.java
 *  Execution:    java ErrorsDivideByZero
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java ErrorsDivideByZero
 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
 *       at HelloWorld.main(HelloWorld.java:20)
 *
 ******************************************************************************/

public class ErrorsDivideByZero {

     public static void main(String[] args) {

         System.out.println(123 / 0);
     }
}
