package academy.learnprogramming.inheritance.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я кот. Зовут меня - " + super.getName();
    }
}
