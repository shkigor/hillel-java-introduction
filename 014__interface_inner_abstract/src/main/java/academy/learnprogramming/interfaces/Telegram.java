package academy.learnprogramming.interfaces;

public class Telegram implements IMessenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram!");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Telegram!");
    }
}
