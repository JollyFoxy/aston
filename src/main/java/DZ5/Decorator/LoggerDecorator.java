package DZ5.Decorator;

public class LoggerDecorator implements Message {
    private Message message;

    public LoggerDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        String content = message.getContent();
        System.out.println("Logging message: " + content);
        return content;
    }

}
