package DZ1.Animal.some_animal;

import DZ1.Animal.Mammals;
import DZ1.Animal.interfaces.IWool;

public class Bear extends Mammals implements IWool {
    public Bear(String animalName) {
        super(animalName);
    }

    @Override
    public void imHaveWool() {
        System.out.println("У меня есть шерсть и я чешусь");
    }

    @Override
    public void imHaveSpine() {
        System.out.println("У меня есть позвоночик и он крепкий");
    }

    @Override
    public void info() {
        System.out.println("Я медведь " + name);
        super.milk();
        imHaveWool();
        imHaveSpine();
        System.out.println("\n");
    }
}
