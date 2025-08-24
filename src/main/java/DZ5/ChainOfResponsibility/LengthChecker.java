package DZ5.ChainOfResponsibility;

public class LengthChecker extends CommentChecker {

    @Override
    public void check(String massage) {
        if (massage.length() <= 10) {
            System.out.println("Слишком короткое сообщение");
        } else if (next != null) {
            next.check(massage);
        }
    }

}
