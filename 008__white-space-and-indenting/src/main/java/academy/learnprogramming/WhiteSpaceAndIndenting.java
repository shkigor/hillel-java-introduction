package academy.learnprogramming;

public class WhiteSpaceAndIndenting {

    public static void main(String[] args) {
        /*
         * White spaces
         *
         */

//        int myVariable=50;
        int                 myVariable
                =
                50
                ;

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" + //; instead + -> got error
                " another" +
                " still more.");
//        System.out.println("This is" + " another" + " still more.");

        int anotherVariable = 50;myVariable--;System.out.println("This is another one");


        /*
         * Indentation - help us to read code more conveniently.
         * Code blocks going to the next indenting level.
         * Reformat code in Idea. Ctrl + Alt + L
         */
        if (myVariable == 50) {
        System.out.println("Printed");
        }
    }
}
