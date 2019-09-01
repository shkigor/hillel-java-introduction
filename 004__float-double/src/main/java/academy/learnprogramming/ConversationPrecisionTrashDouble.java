package academy.learnprogramming;

public class ConversationPrecisionTrashDouble {

    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        //automatic type conversion
        byte byteVal = 100;
        short shortVal = byteVal;
        int intVal = shortVal;
        long longVal = intVal;
//        long longVal = Long.MAX_VALUE;
        float floatVal = longVal;
        double doubleVal = floatVal;

        System.out.println("Byte value " + byteVal);
        System.out.println("Short value " + shortVal);
        System.out.println("Int value " + intVal);
        System.out.println("Long value " + longVal);
        System.out.println("Float value " + floatVal);
        System.out.println("Double value " + doubleVal);


        // Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        // If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.
        int intMaxValue = 2147483647; //Integer.MAX_VALUE
        long longValue = 1 + intMaxValue;
//        long longValue = 1L + intMaxValue;
        System.out.println(longValue);







//// =================== Floating Point Precision (точность после запятой) ===================
//        int myIntValue = 5 / 2;
//        float myFloatValue = 5f / 2f;
//        double myDoubleValue = 5d / 2d;
////        int myIntValue = 5 / 3;
////        float myFloatValue = 5f / 3f;
////        double myDoubleValue = 5.00 / 3.00;
//        System.out.println("MyIntValue= " + myIntValue);
//        System.out.println("MyFloatValue= " + myFloatValue);
//        System.out.println("MyDoubleValue= " + myDoubleValue);


//        // double confusing
//        double val1 = 2.0;
//        double val2 = 1.1;
//        System.out.println(val1 - val2);


//        double trashDouble = Double.parseDouble("4699.9") * 100;
//        int trashInt = (int) (Double.parseDouble("4699.9") * 100); //отбрасывание дробной части
//        System.out.println("4699.9 * 100 = " + trashDouble);
//        System.out.println("4699.9 * 100 = " + trashInt);
//
//
//        // Correct calculation with BigDecimal
//        // https://javarush.ru/groups/posts/2274-kak-ispoljhzovatjh-bigdecimal-v-java
//        BigDecimal bigDecimal1 = new BigDecimal("4699.9");
//        BigDecimal bigDecimal2 = BigDecimal.valueOf(100);
//        System.out.println(bigDecimal1.multiply(bigDecimal2));
    }

}
