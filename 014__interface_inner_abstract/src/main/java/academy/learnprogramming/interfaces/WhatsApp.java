package academy.learnprogramming.interfaces;

public class WhatsApp implements IMessenger {

    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp!");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в WhatsApp!");
    }
}
