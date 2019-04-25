package ua.ithillel.javabasic.lesson1;

public class ArgumentsExample {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
    }
}
