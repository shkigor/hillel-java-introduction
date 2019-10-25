package academy.learnprogramming.interfaces.messenger;

public class WhatsApp implements IMessenger {

    public void sendMessage(String message) {
        System.out.println("Отправляем сообщение в WhatsApp! -- " + message);
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в WhatsApp!");
    }
}
