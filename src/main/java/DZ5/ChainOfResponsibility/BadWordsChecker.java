package DZ5.ChainOfResponsibility;

public class BadWordsChecker extends CommentChecker {

    @Override
    public void check(String massage) {
        if (massage.indexOf("ругательство") != -1) {
            System.out.println("Блоируем из-за плохих слов");
        } else if (next != null) {
            next.check(massage);
        }
    }

}
