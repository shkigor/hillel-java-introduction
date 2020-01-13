package academy.learnprogramming.own_exception;

public class PersonNotEnoughMoneyException extends RuntimeException {
    public PersonNotEnoughMoneyException(String message) {
        super(message);
    }
}
