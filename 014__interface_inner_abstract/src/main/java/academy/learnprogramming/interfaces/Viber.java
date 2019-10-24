package academy.learnprogramming.interfaces;

public class Viber implements IMessenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber!");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Viber!");
    }
}
