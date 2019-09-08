package academy.learnprogramming.bodymassindex;

public class Main {
    public static void main(String[] args) {
        String namePetrov = "Petrov";
        double weightPetrov = 106; // кг
        double heightPetrov = 168; // см
        double bmiPetrov = BodyMassIndex.calculateBodyMassIndex(weightPetrov, heightPetrov / 100);
        BodyMassIndex.printResult(namePetrov, weightPetrov, heightPetrov, bmiPetrov);
    }
}
