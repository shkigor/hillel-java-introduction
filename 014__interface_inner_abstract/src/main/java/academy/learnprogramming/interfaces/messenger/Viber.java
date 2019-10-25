package academy.learnprogramming.interfaces.messenger;

public class Viber implements IMessenger {

    public void sendMessage(String message) {
        System.out.println("Отправляем сообщение в Viber! -- " + message);
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Viber!");
    }
}
