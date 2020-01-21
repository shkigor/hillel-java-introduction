package academy.learnprogramming.polymorphism.dancer;

import academy.learnprogramming.polymorphism.flowers.IDancer;

public class MainDancer {

    public static void main(String[] args) {
        IDancer[] dancers = new IDancer[20];
        for (int i = 0; i < dancers.length; i++) {
            dancers[i] = getRandomDancer();
        }
        for (IDancer dancer: dancers ) {
            dancer.dance();
        }
    }

    static IDancer getRandomDancer() {
        int rand = (int) (Math.random() * 3) + 1;
        switch (rand) {
            case 1:
                return new ElectricDancer("Anton", 23);
            case 2:
                return new PopDancer("Elene", 34);
            default:
                return new Dancer("Evgeniy", 29);
        }
    }
}
