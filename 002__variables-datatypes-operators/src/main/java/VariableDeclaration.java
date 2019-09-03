public class VariableDeclaration {

    public static void main(String[] args) {
        byte byteValue = 22; // инициализация переменной byteValue
        int x, y, z; // объявление трех переменных типа int: x, y и z
        int d = 3, e, f = 5; // объявление еще трех переменных типа int с инициализацией d и f


        // Использовать неинициализированную переменную в выражениях нельзя
//        System.out.println(x);


        double a = 3.0, b = 4.0;
        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);

        // Константы в Java
        final double CM_PER_INCH = 2.54;
//        CM_PER_INCH = 1.0;
    }
}
