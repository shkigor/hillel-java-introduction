package academy.learnprogramming;

import java.util.*;

/*
Теория вероятностей на практике или знаете ли вы о Random
https://javarush.ru/groups/posts/1977-teorija-verojatnosti-na-praktike-ili-znaete-li-vih-pro-random

Random, SecureRandom, ThreadLocalRandom and SplittableRandom - Different ways to create Random numbers in Java
https://www.logicbig.com/how-to/java-random/different-random-classes.html
*/

public class Bool {
    public static void main(String[] args) {
        // http://developer.alexanderklimov.ru/android/java/random.php
        Random rand = new Random(47); // генератор псевдослучайных чисел
        SplittableRandom random = new SplittableRandom();

        System.out.println("splittableRandom = " + random.nextInt(99, 101));
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));

        // Treating an int as a boolean is not legal Java:
        //- System.out.println("i && j is " + (i && j));
        //- System.out.println("i || j is " + (i || j));
        //- System.out.println("!i is " + !i);

        System.out.println("(i < 10) && (j < 10) is "  + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is "  + ((i < 10) || (j < 10)));
    }
}
/* Output:
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 10) && (j < 10) is false
(i < 10) || (j < 10) is false
*/
