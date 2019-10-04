package academy.learnprogramming.reference_object_instance_class;

public class MainHouse {

    public static void main(String[] args) {
        House blueHouse = new House("blue");

        House anotherHouse = blueHouse;

        System.out.println("blueHouse - " + blueHouse.getColor());
        System.out.println("anotherHouse - " + anotherHouse.getColor());

        System.out.println("\n*** anotherHouse.setColor(\"red\"); ***");
        anotherHouse.setColor("red");

        System.out.println("blueHouse - " + blueHouse.getColor());
        System.out.println("anotherHouse - " + anotherHouse.getColor());

        House greenHouse = new House("green");
        System.out.println("\n*** anotherHouse = greenHouse; ***");
        anotherHouse = greenHouse;

        System.out.println("blueHouse - " + blueHouse.getColor());
        System.out.println("greenHouse - " + greenHouse.getColor());
        System.out.println("anotherHouse - " + anotherHouse.getColor());
    }
}
