package academy.learnprogramming.static_instance.methods.statics;

public class Main {

    public static void main(String[] args) {
        Calculator.printSum(3, 4);
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}


class Calculator {
    int memory;

    public static void printSum(int a, int b) {
//        this.memory = 10;
//        getMemory();
        System.out.println("sum = " + (a + b));
    }

    public int getMemory() {
        return memory;
    }
}