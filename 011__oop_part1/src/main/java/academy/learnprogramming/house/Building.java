package academy.learnprogramming.house;

public class Building {
    private final int FLOORS;
    private int builtFloors;
    private String address;

    public Building(int FLOORS, int builtFloors, String address) {
        this.FLOORS = FLOORS;
        this.builtFloors = builtFloors;
        this.address = address;
    }

    public boolean getSatatus() {
        return FLOORS - builtFloors == 0;
    }

    public String getAddress() {
        return address;
    }
}
