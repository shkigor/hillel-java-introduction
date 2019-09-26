package academy.learnprogramming;

public class WhileDoWhileLoop {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);


        /*
            Объявите две переменные типа int - startNumber и finishNumber
            Используя цикл while выведите все четные числа из диапазона от startNumber до finishNumber
        */



        int startNumber = 5;
        int finishNumber = 20;
        while(startNumber <= finishNumber) {
            if(!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }

            System.out.println("Even number " + startNumber);
            startNumber++;
        }






        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found



        startNumber = 5;
        finishNumber = 20;
        int evenNumbersFound = 0;
        while (startNumber <= finishNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }

            System.out.println("Even number " + startNumber);
            startNumber++;

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);


    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
