package academy.learnprogramming.polymorphism.dancer;

import academy.learnprogramming.polymorphism.flowers.IDancer;

public class Dancer implements IDancer {
    String name;
    int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.print(toString());
        System.out.println("Умею танцевать обычный танец");
    }

    @Override
    public String toString() {
        return "Зовут меня - " + name + ". Мне " + age + " лет. ";
    }
}
