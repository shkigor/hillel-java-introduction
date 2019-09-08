package academy.learnprogramming;

public class IfThenElseStatement {
    public static void main(String[] args) {
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

        // Difference between equals and assignment operators
//        if (newValue = 50) { // result is the int value
//            System.out.println("result is the int value");
//        }

        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        // (isCar == true) or (isCar != false)
        if (isCar) { // (isCar = true) happy path and we don't have any error
            System.out.println("This is not supposed to happen");
        }

        if (isCar = true) { // (isCar = true) happy path and we don't have any error
            System.out.println("This is not supposed to happen");
        }



        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score >1000) {
            System.out.println("This was was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");

        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }





        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
