package academy.learnprogramming;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BodyMassIndex {
    public static void main(String[] args) {
        String namePetrov = "Petrov";
        double weightPetrov = 106; // кг
        double heightPetrov = 168; // см
        double bmiPetrov = calculateBodyMassIndex(weightPetrov, heightPetrov / 100);
        printResult(namePetrov, weightPetrov, heightPetrov, bmiPetrov);
    }

    private static void printResult(String namePetrov, double weight, double height, double bmi) {
        System.out.println(namePetrov + ": weight = " + weight + ", height = " + height);
        System.out.println("BMI = " + round(bmi, 2) + " (" + interpretation(bmi) + ")");
    }

    private static String interpretation(double bmi) {
        if (bmi < 16) {
            return "Выраженный дефицит массы тела";
        } else if (bmi >= 16 && bmi < 18.5) {
            return "Недостаточная (дефицит) масса тела";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Норма";
        } else if (bmi >= 25 && bmi < 30) {
            return "Избыточная масса тела (предожирение)";
        } else if (bmi >= 30 && bmi < 35) {
            return "Ожирение";
        } else if (bmi >= 35 && bmi < 40) {
            return "Ожирение резкое";
        } else {
            return "Очень резкое ожирение";
        }
    }

    /**
     * Вычисление индекса массы тела.
     * И́ндекс ма́ссы те́ла (англ. body mass index (BMI), ИМТ) — величина, позволяющая оценить
     * степень соответствия массы человека и его роста и тем самым косвенно оценить,
     * является ли масса недостаточной, нормальной или избыточной.
     * Важен при определении показаний для необходимости лечения.
     *
     * @param weight масса тела в килограммах
     * @param height рост в метрах
     * @return И́ндекс ма́ссы те́ла
     */
    public static double calculateBodyMassIndex(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Округление Double с помощью BigDecimal
     * https://www.internet-technologies.ru/articles/kak-v-java-okruglit-chislo-do-n-znakov-posle-zapyatoy.html
     *
     * @param value  значение, которое нужно округлить
     * @param places количество знаков после запятой
     * @return округленное значение
     */
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bigDecimal = new BigDecimal(Double.toString(value));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
