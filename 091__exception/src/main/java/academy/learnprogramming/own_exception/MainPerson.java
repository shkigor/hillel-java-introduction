package academy.learnprogramming.own_exception;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Гарри", 200);
        try {
            person.withdraw(300);
        } catch (PersonNotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(person.getBalance());
    }
}
