package academy.learnprogramming.speedconverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите любое дробное число (разделитель запятая): ");
        Scanner scan = new Scanner(System.in);
        double kilometersPerHour = scan.nextDouble();
        long miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println("Km/h = " + kilometersPerHour);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
