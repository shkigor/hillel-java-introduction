package academy.learnprogramming.user_input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (true) {
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Exit");
                break;
            }
            System.out.println("Your enter: " + input);
            input = sc.nextLine();
        }
    }
}
