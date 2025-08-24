package DZ5.Decorator;

public class SimpleMassage implements Message {
    private String text;

    public SimpleMassage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }

}
