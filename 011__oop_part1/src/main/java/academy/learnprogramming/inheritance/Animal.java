package academy.learnprogramming.inheritance;

public class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        System.out.println("Constructor Animal called - " + name);
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called - " + this.name);
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at speed " + speed);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
