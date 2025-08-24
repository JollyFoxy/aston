package DZ5.Decorator;

public class HtmlDecorator implements Message {

    private Message message;

    public HtmlDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return new StringBuilder().append("<b>")
                .append(message.getContent())
                .append("</b>")
                .toString();
    }

}