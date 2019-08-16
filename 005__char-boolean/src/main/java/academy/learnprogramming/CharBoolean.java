package academy.learnprogramming;

public class CharBoolean {

    public static void main(String[] args) {

    // =================== char Primitive Data Type ===================
    char symA = 'À';
    char symB = (char) (symA + 1);

    char myUnicodeCharCode = 1040;
    char myUnicodeCharA = '\u0410';
    char myCopyrightChar = '\u00A9';

    System.out.println(symA);
    System.out.println(myUnicodeCharCode);
    System.out.println(myUnicodeCharA);
    System.out.println(myCopyrightChar);
    System.out.println("symB = " + symB);

    System.out.println((int) symA);
    System.out.println(Integer.toHexString((int) symA));
    System.out.println(Character.codePointAt(new char[] {symA}, 0));


    // =================== boolean Primitive Data Type ===================
    boolean myTrueBooleanValue = true;
    boolean myFalseBooleanValue = false;

    boolean isCustomerOverTwentyOne = true; // is the Question
    System.out.println(isCustomerOverTwentyOne);
        
    }
}
