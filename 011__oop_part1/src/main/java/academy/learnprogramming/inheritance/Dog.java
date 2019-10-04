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

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called with speed " + speed);
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
