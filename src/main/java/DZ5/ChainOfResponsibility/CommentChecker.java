package DZ5.ChainOfResponsibility;

public abstract class CommentChecker {
    protected CommentChecker next;

    public void setNext(CommentChecker next) {
        this.next = next;
    }

    public abstract void check(String massage);

}
