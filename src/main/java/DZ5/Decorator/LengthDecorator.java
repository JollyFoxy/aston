package DZ5.Decorator;

public class LengthDecorator implements Message {
    private Message message;

    public LengthDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        int length = message.getContent().length();
        return new StringBuilder()
                .append(message.getContent())
                .append("[Length: ")
                .append(length)
                .append("]")
                .toString();
    }

}
