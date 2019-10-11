package academy.learnprogramming.overload_demo;

// Применение автоматического преобразования типов к перегрузке.
public class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i); // эта инструкция вызовет test(double)

        ob.test(123.2); // эта инструкция вызовет test(double)

    }
}

class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Проверка перегрузки на наличие двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("а и b: " + a + " " + b);
    }

    // Проверка перегрузки на наличие параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }

//    // Проверка перегрузки на наличие параметра типа int
//    int test(int a) {
//        System.out.println("int a: " + a);
//        return a*a;
//    }

}
