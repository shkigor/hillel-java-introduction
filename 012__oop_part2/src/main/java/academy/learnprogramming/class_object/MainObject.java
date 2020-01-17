package academy.learnprogramming.class_object;

public class MainObject {

    public static void main(String[] args) {
        Car honda1 = new Car("Honda", "CR-V");
        Car honda2 = new Car("Honda", "CR-V");
        Car mazda = new Car("Mazda", "626");

        System.out.println("honda1.hashCode()  - " + honda1.hashCode());
        System.out.println("honda2.hashCode()  - " + honda2.hashCode());
        System.out.println("mazda.hashCode()  - " + mazda.hashCode());

        System.out.println("honda1 == mazda  - " + honda1.equals(mazda));
        System.out.println("honda1 == honda2  - " + honda1.equals(honda2));
    }
}
