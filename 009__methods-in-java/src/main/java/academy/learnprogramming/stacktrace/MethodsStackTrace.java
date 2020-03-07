package academy.learnprogramming.stacktrace;

public class MethodsStackTrace {
    public static void main(String[] args) {
        greet("MAGGIE");
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    private static void bye() {
        System.out.println("ok bye!");
    }

    private static void greet2(String name) {
        System.out.println("How are you, " + name + "?");
    }
}
