package academy.learnprogramming.interfaces.refrigerator_listener;

import java.util.Date;

public class Refrigerator {
    private boolean isOn;
    private boolean isDoorOpen;
    private double innerTemperature;
    private String model;
    private RefrigeratorListener refrigeratorListener;

    public Refrigerator(String model) {
        this.model = model;
        System.out.println("Холодильник " + model + " создан");
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Холодильник " + model + " включен");
    }

    public void toggleDoor() {
        this.isDoorOpen = !this.isDoorOpen;
        if (isDoorOpen && refrigeratorListener != null && this.isOn) {
            refrigeratorListener.doorOpened(this.model, new Date());
        }
        if (!isOn) {
            System.out.println("Внимание!!! Холодильник " + this.model + " выключен");
        }
    }

    public void setRefrigeratorListener(RefrigeratorListener refrigeratorListener) {
        this.refrigeratorListener = refrigeratorListener;
    }
}
