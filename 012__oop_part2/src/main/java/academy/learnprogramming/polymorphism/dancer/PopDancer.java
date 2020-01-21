package academy.learnprogramming.polymorphism.dancer;

import academy.learnprogramming.polymorphism.flowers.IDancer;

public class PopDancer extends Dancer implements IDancer {

    public PopDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.print(toString());
        System.out.println("Танцую pop dance");
    }
}
