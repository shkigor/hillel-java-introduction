package academy.learnprogramming.own_exception;

public class Person {
    private String name;
    private double balance;

    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new PersonNotEnoughMoneyException("Недостаточно средств");
        }
        balance -= amount;
    }
}
