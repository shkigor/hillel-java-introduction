package academy.learnprogramming.polymorphism.dancer;

import academy.learnprogramming.polymorphism.flowers.IDancer;

public class ElectricDancer extends Dancer implements IDancer {

    public ElectricDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.print(toString());
        System.out.println("Танцую electric dance");
    }
}
