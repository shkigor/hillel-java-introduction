package academy.learnprogramming.inheritance.animal;

public class AnimalFactory {

    static Animal getAnimalByKey(String key) {
        Animal resultAnimal = null;
        switch (key) {
            case "da":
                resultAnimal = new Dog("Арамис");
                break;
            case "db":
                resultAnimal = new Dog("Блек");
                break;
            case "dc":
                resultAnimal = new Dog("Спайки");
                break;
            case "ca":
                resultAnimal = new Cat("Амадей");
                break;
            case "cb":
                resultAnimal = new Cat("Баксик");
                break;
            case "cc":
                resultAnimal = new Cat("Снежок");
                break;
            default:
                break;
        }
        return resultAnimal;
    }
}
