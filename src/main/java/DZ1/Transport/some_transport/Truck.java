package DZ1.Transport.some_transport;

import DZ1.Transport.Transport;
import DZ1.Transport.interfaces.ICargo;
import DZ1.Transport.interfaces.IWheel;

public class Truck extends Transport implements IWheel, ICargo {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("Предвигаюсь по земле");
    }

    @Override
    public void info() {
        System.out.println("Грузовик "+ name);
        moving();
        havesWheels();
        сarriesCargo();
    }

    @Override
    public void havesWheels() {
        System.out.println("Использует колёса для движения по земле");
    }

    @Override
    public void сarriesCargo() {
        System.out.println("Перевозит грузы по зепле");
    }
}
