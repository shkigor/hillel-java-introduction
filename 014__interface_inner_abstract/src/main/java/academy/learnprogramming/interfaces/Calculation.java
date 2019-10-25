package academy.learnprogramming.interfaces;

public class Calculation implements Formula {
    @Override
    public double calculate(int a) {
        return a*a + sqrt(a);
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculate(9));
    }
}
