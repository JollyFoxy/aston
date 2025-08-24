package DZ5.ChainOfResponsibility;

public class SpamChecker extends CommentChecker {

    @Override
    public void check(String massage) {
        if ((massage.contains("реклама")) ||
                (massage.contains("спам"))) {
            System.out.println("Блокируем из-за того, что нам за это не платили");
        } else if (next != null) {
            next.check(massage);
        }
    }
}
