package academy.learnprogramming.interfaces;

@FunctionalInterface
public interface Formula {
    double calculate(int a, int b);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}


