package academy.learnprogramming.interfaces.refrigerator_listener;

import java.util.Date;

public class Person implements RefrigeratorListener {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void doorOpened(String refrigeratorModel, Date date) {
        System.out.println(this.name + " оповещен(а) об открытии двери холодильника " + refrigeratorModel + " в " + date);
    }
}
