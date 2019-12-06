package academy.learnprogramming;

import java.math.BigDecimal;

public class FloatDouble {

    public static void main(String[] args) {

// =================== Floating Point Precision ===================
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

//        int myIntValue = 5;
//        float myFloatValue = 5.25f;
//        float myFloatValue2 = (float) 5.25;
//        double myDoubleValue = 5.25d;



// =================== Floating Point Precision ===================
//        int myIntValue = 5 / 2;
//        float myFloatValue = 5f / 2f;
//        double myDoubleValue = 5d / 2d;
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("");
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

//        double numberOfPounds = 200d;
//        double convertedKilograms = numberOfPounds * 0.45359237d;
//        System.out.println("Converted kilograms= " + convertedKilograms);

//        double pi = 3.1415927d;
//        double anotherNumber = 3_000_000.4_567_890d;
//        System.out.println(pi);
//        System.out.println(anotherNumber);

        // double confusing
        System.out.println("\nDOUBLE CONFUSING");
        double val1 = 2.0;
        double val2 = 1.1;
        System.out.println(val1 - val2);

        // trashDouble
        System.out.println("\nTRASH DOUBLE");
        double trashDouble = Double.parseDouble("4699.9") * 100;
        int trashInt = (int) (Double.parseDouble("4699.9") * 100); //отбрасывание дробной части
        System.out.println("4699.9 * 100 = " + trashDouble);
        System.out.println("4699.9 * 100 = " + trashInt);


        // Correct calculation with BigDecimal
        // https://javarush.ru/groups/posts/2274-kak-ispoljhzovatjh-bigdecimal-v-java
        System.out.println("\nCORRECT CALCULATION WITH BigDecimal");
        BigDecimal bigDecimal1 = new BigDecimal("4699.9");
        BigDecimal bigDecimal2 = BigDecimal.valueOf(100);
        System.out.println(bigDecimal1.multiply(bigDecimal2));


        // https://stackoverflow.com/questions/14137989/java-division-by-zero-doesnt-throw-an-arithmeticexception-why
        System.out.println("\nСпециальное значение Infinity и NaN");
        double positive_infinity = 12.0 / 0; // Специальное значение Infinity
        System.out.println(positive_infinity);
        System.out.println("Is finite positive_infinity? " + Double.isFinite(positive_infinity));
        System.out.println("false - for NaN and infinity arguments");

        double negative_infinity = -15.0 / 0;
        System.out.println(positive_infinity + negative_infinity); //return NaN
        System.out.println(Double.isNaN(positive_infinity + negative_infinity)); //return true

        double sqrt = Math.sqrt(-4); //NaN
        System.out.println(sqrt);

        
    }
}
