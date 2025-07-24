package DZ1.Transport.some_transport;

import DZ1.Transport.Transport;
import DZ1.Transport.interfaces.ICargo;
import DZ1.Transport.interfaces.IPropeller;

public class Tanker extends Transport implements IPropeller, ICargo {
    public Tanker(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("Передвигается по воде");
    }

    @Override
    public void info() {
        System.out.println("Танкер "+ name);
        moving();
        havesPropeller();
        сarriesCargo();
    }

    @Override
    public void сarriesCargo() {
        System.out.println("Перевозит груз по воде");
    }

    @Override
    public void havesPropeller() {
        System.out.println("Изпользует винт для предвижения по воде");

    }
}
