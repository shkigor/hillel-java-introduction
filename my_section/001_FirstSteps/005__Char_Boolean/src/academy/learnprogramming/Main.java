package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    // =================== char Primitive Data Type ===================
    char symA = 'А';

    // symA = 1040;
    // symA = '\u0410';

    System.out.println(symA);

    System.out.println((int) symA);
    System.out.println(Integer.toHexString((int) symA));
    System.out.println(Character.codePointAt(new char[] {symA}, 0));
        
    }
}
