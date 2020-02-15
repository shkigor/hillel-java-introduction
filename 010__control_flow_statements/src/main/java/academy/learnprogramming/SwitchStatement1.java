package academy.learnprogramming;

import java.util.SplittableRandom;

public class SwitchStatement1 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int randomValue = random.nextInt(1, 7);
        String result;
        switch (randomValue) {
            case 1:
                System.out.print("Выпало 1");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
            case 2:
                System.out.print("Выпало 2");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
            case 3:
                System.out.print("Выпало 3");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
            case 4:
                System.out.print("Выпало 4");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
            case 5:
                System.out.print("Выпало 5");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
            case 6:
                System.out.print("Выпало 6");
                result = isEvenNumber(isEvenNumber(randomValue));
                System.out.println(" - " + result);
                break;
        }
    }

    private static boolean isEvenNumber(int randomValue) {
        return randomValue % 2 == 0;
    }

    private static String isEvenNumber(boolean isEven) {
        return isEven ? "Четное число" : "Нечетное число";
    }

}
