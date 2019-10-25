package academy.learnprogramming.interfaces.messenger;

public class MainMessenger {

    public static void main(String[] args) {
        Client petrov = new Client("Петров", new Viber());
        petrov.send("Привет!");
        petrov.recieve();

        Client sidorov = new Client("Сидоров", new Telegram());
        sidorov.send("Ура! Я приехал");
        sidorov.recieve();
    }
}
