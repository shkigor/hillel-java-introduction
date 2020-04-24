package academy.learnprogramming.static_instance.variables.instance;

class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog.printHello();
        Dog fluffy = new Dog("fluffy");

        rex.printName();
        fluffy.printName();
    }
}
