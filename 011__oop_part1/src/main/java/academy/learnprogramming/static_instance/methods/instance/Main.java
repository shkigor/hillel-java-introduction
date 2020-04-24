package academy.learnprogramming.static_instance.methods.instance;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.bark();
    }
}

class Dog {
    int age;

    public void bark() {
        System.out.println("woof" + this.age);
        bark1();
    }

    public void bark1() {
        System.out.println("woof" + age);
    }
}
