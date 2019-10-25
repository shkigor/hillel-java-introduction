package academy.learnprogramming.interfaces.messenger;

import java.util.ArrayList;

public class Telegram implements IMessenger, ISmiley {

    public void sendMessage(String message) {
        System.out.println("Отправляем сообщение в Telegram! -- " + message);
        System.out.println("Добавляем смайлик ...");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Telegram!");
    }

    @Override
    public ArrayList getSmileyes(String category) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        return arrayList;
    }
}
