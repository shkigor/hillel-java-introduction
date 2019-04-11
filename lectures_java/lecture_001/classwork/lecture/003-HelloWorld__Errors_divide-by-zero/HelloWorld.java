/*
  Run-time error. Ошибки во время выполнения. Деление на ноль
*/

/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
 *       at HelloWorld.main(HelloWorld.java:20)
 *
 ******************************************************************************/

public class HelloWorld {

     public static void main(String[] args) {

         System.out.println(123 / 0);
     }
}
