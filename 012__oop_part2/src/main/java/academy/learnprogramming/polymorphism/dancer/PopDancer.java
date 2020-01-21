package academy.learnprogramming.polymorphism.dancer;

public class PopDancer extends Dancer{

    public PopDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.print(toString());
        System.out.println("Танцую pop dance");
    }
}
