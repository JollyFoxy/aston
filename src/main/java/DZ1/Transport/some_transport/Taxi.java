package DZ1.Transport.some_transport;

import DZ1.Transport.Transport;
import DZ1.Transport.interfaces.ICargo;
import DZ1.Transport.interfaces.IWheel;

import java.util.SortedMap;

public class Taxi extends Transport implements IWheel {
    public Taxi(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("Предвигаюсь по земле");
    }

    @Override
    public void info() {
        System.out.println("Такси "+ name);
        moving();
        havesWheels();
    }

    @Override
    public void havesWheels() {
        System.out.println("Использует колёса для движения по земле");
    }
}
