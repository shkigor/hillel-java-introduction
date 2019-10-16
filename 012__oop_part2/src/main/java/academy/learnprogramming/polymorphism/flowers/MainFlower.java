package academy.learnprogramming.polymorphism.flowers;

public class MainFlower {
    public static void main(String[] args) {
        bunchOfFlowers(11);
    }

    public static void bunchOfFlowers(int amount) {
        System.out.println("Сформирован букет из " + amount + " цветов:");
        int sum = 0;
        for (int i = 1; i <= amount; i++) {
            Flower flower = getRandomFlower();
            System.out.println("#" + i + " " + flower.getName());
            sum += flower.getCost();
        }
        System.out.println("Стоимость букета - " + sum);
    }

    public static Flower getRandomFlower() {
        int random = (int) (Math.random() * 3) + 1;
        switch (random) {
            case 1:
                return new Rose("Роза", 45.0);
            case 2:
                return new Camomile("Ромашка", 15.0);
            case 3:
                return new Tulip("Тюльпан", 20);
        }
        return null;
    }
}
