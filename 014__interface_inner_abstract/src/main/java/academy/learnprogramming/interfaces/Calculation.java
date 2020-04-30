package academy.learnprogramming.interfaces;

public class Calculation implements Formula {
    @Override
    public double calculate(int a, int b) {
        return a*a + sqrt(b);
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculate(9, 4));
    }
}
