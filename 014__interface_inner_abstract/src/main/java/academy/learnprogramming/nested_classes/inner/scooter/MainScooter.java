package academy.learnprogramming.nested_classes.inner.scooter;

public class MainScooter {

    public static void main(String[] args) {
        Scooter scooter = new Scooter("K100", 120, 5);
        Scooter.Wheel wheel = scooter.new Wheel(1);

        wheel.up(10);
        scooter.start();
        wheel.left();
        wheel.right();
    }
}
