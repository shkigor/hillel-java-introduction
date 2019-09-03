package academy.learnprogramming.speedconverter;

public class Main {

    public static void main(String[] args) {

        double kilometersPerHour = 10.5;
        double miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println("Km/h = " + kilometersPerHour);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
