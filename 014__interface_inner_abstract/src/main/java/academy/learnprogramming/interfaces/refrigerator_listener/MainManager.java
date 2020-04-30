package academy.learnprogramming.interfaces.refrigerator_listener;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainManager {

    public static void main(String[] args) {
        Refrigerator minsk = new Refrigerator("Minsk");
        Refrigerator lg = new Refrigerator("LG");

        Person anna = new Person("Anna");
        minsk.setRefrigeratorListener(anna);
        minsk.toggleDoor();

        minsk.turnOn();
        minsk.toggleDoor();
        minsk.toggleDoor();

        lg.turnOn();
        String dummy = "dummy text";
        lg.setRefrigeratorListener(new RefrigeratorListener() {
            @Override
            public void doorOpened(String refrigeratorModel, Date date) {
                System.out.println(dummy);
            }
        });
        lg.toggleDoor();

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(n -> System.out.println(n));


    }
}
