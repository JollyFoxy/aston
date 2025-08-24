package DZ5;

import DZ5.Adapter.CassetteAdapter;
import DZ5.Adapter.CassettePlayer;
import DZ5.Adapter.MusicPlayer;
import DZ5.Builder.Computer;
import DZ5.ChainOfResponsibility.BadWordsChecker;
import DZ5.ChainOfResponsibility.CommentChecker;
import DZ5.ChainOfResponsibility.LengthChecker;
import DZ5.ChainOfResponsibility.SpamChecker;
import DZ5.Decorator.EncryptDecorator;
import DZ5.Decorator.HtmlDecorator;
import DZ5.Decorator.LengthDecorator;
import DZ5.Decorator.LoggerDecorator;
import DZ5.Decorator.Message;
import DZ5.Decorator.SimpleMassage;
import DZ5.Proxy.CachedExpensiveOperationProxy;
import DZ5.Proxy.ExpensiveOperation;
import DZ5.Strategy.ExpressDelivery;
import DZ5.Strategy.Order;

public class Main {
    public static void main(String[] args) {
        // Стратегия
        Order order = new Order(5000);
        order.setDeliveryStrategy(new ExpressDelivery());
        System.out.println(order.calculateTotal());

        // Цепочка обязоностей
        CommentChecker badWords = new BadWordsChecker();
        CommentChecker spam = new SpamChecker();
        CommentChecker length = new LengthChecker();

        spam.setNext(badWords);
        badWords.setNext(length);

        spam.check("Это реклама");
        spam.check("ругательство");
        spam.check("aaa");

        // Строитель
        Computer pc = new Computer.Builder("Intel I5", "32 GB DDR4")
                .gpu("RTX 3050")
                .os("Ubuntu")
                .storage("5 TB HDD")
                .build();
        System.out.println(pc);

        // Заместитель
        ExpensiveOperation eo = new CachedExpensiveOperationProxy();

        System.out.println(eo.calculate(5));
        System.out.println(eo.calculate(5));
        System.out.println("=============================");
        System.out.println(eo.calculate(6));

        // Декоратор
        Message message = new SimpleMassage("Hello World");
        Message decorated = new LengthDecorator(
                new LoggerDecorator(
                        new HtmlDecorator(
                                new EncryptDecorator(message))));
        System.out.println(decorated.getContent());

        // Адаптер

        CassettePlayer cassettePlayer = new CassettePlayer();
        MusicPlayer player = new CassetteAdapter(cassettePlayer);

        player.play("Queen - Bohemian Rhapsody");
    }
}
