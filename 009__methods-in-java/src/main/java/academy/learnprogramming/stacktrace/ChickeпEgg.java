package academy.learnprogramming.stacktrace;

public class ChickeпEgg {
    public static void main(String[] args) {
        System.out.println(chickeп() + "пришел первым");
    }

    private static String chickeп() {
        return egg();
    }

    private static String egg() {
        return chickeп();
    }
}
