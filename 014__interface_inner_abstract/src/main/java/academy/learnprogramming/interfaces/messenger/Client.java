package academy.learnprogramming.interfaces.messenger;

public class Client {
    private String name;
    private IMessenger messenger;

    public Client(String name, IMessenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public void send(String text) {
        messenger.sendMessage(text);
    }

    public void recieve() {
        messenger.getMessage();
    }
}
