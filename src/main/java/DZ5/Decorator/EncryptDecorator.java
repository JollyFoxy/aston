package DZ5.Decorator;

public class EncryptDecorator implements Message {
    private Message message;

    public EncryptDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return new StringBuilder().append(message.getContent()).append(" (encrypted)").toString();
    }

}
