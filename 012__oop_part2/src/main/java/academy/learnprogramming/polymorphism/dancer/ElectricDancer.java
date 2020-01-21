package academy.learnprogramming.polymorphism.dancer;

public class ElectricDancer extends Dancer {

    public ElectricDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.print(toString());
        System.out.println("Танцую electric dance");
    }
}
