package academy.learnprogramming;

/**
 * Summary of Operators
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 */
public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        /*
         * More operators
         *
         */
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        /*
         * if-then Statement
         *
         */
        boolean isAlien = false;

        if (isAlien == false);
            System.out.println("It is not an alien!");

        if (isAlien)
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        if (topScore != 100) { // > >= < <=
            System.out.println("You didn't get the high score!");
        }

        topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 65;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        // (isCar == true) or (isCar != false)
        if (isCar) { // (isCar = true) happy path and we don't have any error
            System.out.println("This is not supposed to happen");
        }

        /*
         * Ternary Operator
         *
         */
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        /*
         * Operator precedence
         *
         * https://introcs.cs.princeton.edu/java/11precedence/
         *
        */
        int now = 2019;
        int yearJohn = 1989;
        int fullAge = 18;

        // Multiple operators
        boolean isFullAge = now - yearJohn >= fullAge; // true
        System.out.println(isFullAge);

        // Grouping
        int ageJohn = now - yearJohn;
        int ageMark = 35;
        int average = (ageJohn + ageMark) / 2;
        System.out.println(average);

        // Multiple assignments
        int x, y;
        x = y = (3 + 5) * 4 - 6; // 8 * 4 - 6 // 32 - 6 // 26
        System.out.println("x = " + x + " y = " + y);


    }
}
