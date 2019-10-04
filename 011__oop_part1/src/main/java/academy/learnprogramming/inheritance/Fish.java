package academy.learnprogramming.inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, double weight, int gills, int eyes, int fins) {
        super(name, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
