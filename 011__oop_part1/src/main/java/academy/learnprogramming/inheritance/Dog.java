package academy.learnprogramming.inheritance;

public class Dog extends Animal {
    private String color;

    public Dog(String name, double weight, String color) {
        super(name, weight);
        System.out.println("Constructor Dog called - " + getName());
        this.color = color;
    }

    private void chew() {
        System.out.println("Dog.chew() called - " + getName());
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called - " + getName());
        chew();
        super.eat();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
