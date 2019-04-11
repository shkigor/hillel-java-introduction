/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *  Привет Мир!
 ******************************************************************************/

/*
    Наша первая программа. Для запуска необходимо:
    1) Создать программу введя следующий текст в любой текстовый редактор
       и сохранить файл под именем HelloWorld.java
    2) Откомпилировать программу введя команду в терминале
       "javac HelloWorld.java"
    3) Запустить программу на выполнение введя команду в терминале
       "java HelloWorld"

    Файл должен называться точно так же как публичный класс,
    который он содержит плюс расширение .java, иначе он просто не скомпилируется.
    То есть, в нашем случае, файл HelloWorld.java содержит public класс HelloWorld.

*/

/**
    Класс, при запуске которого в консоле выводится фраза Hello, World
*/
public class HelloWorld {

     public static void main(String[] args) {
         System.out.println("Hello, World"); // prints "Hello, World" in the terminal window.
         System.out.println("Привет Мир!");
     }
}