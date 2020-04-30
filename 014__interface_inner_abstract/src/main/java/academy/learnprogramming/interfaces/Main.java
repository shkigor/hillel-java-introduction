package academy.learnprogramming.interfaces;

public class Main {
    public static void main(String[] args) {
        Formula formula = ((a, b) -> a + b);
        System.out.println(formula.calculate(23, 45));
    }
}
