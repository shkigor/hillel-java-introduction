package academy.learnprogramming.house;


public class MainBuilding {

    public static void main(String[] args) {
        Building polyarniy = new Building(23, 15, "вул. Полярная 10");
        Building pobeda = new Building(23, 23, "вул. Победы 1");
        Building shevchenko = new Building(23, 1, "вул. Шевченка 6");

        System.out.println(polyarniy.getAddress() + ": " + polyarniy.getSatatus());
        System.out.println(pobeda.getAddress() + ": " + pobeda.getSatatus());
        System.out.println(shevchenko.getAddress() + ": " + shevchenko.getSatatus());
    }
}
