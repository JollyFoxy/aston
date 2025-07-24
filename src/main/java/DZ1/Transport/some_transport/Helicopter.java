package DZ1.Transport.some_transport;

import DZ1.Transport.Transport;
import DZ1.Transport.interfaces.ICargo;
import DZ1.Transport.interfaces.IPropeller;
import DZ1.Transport.interfaces.IWheel;

public class Helicopter extends Transport implements IWheel, IPropeller, ICargo {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("Пердвигается по воздуху");
    }

    @Override
    public void info() {
        System.out.println("Самолет "+ name);
        moving();
        havesWheels();
        havesPropeller();
        сarriesCargo();
    }

    @Override
    public void сarriesCargo() {
        System.out.println("Перевозит груз по воздуху");
    }

    @Override
    public void havesPropeller() {
        System.out.println("Имеет винт для движения по воздуху");
    }

    @Override
    public void havesWheels() {
        System.out.println("Имеет колёса в виде шасси");

    }
}
