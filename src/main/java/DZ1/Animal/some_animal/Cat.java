package DZ1.Animal.some_animal;

import DZ1.Animal.Mammals;
import DZ1.Animal.interfaces.IWool;

public class Cat extends Mammals implements IWool {
    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void imHaveWool() {
        System.out.println("У меня есть шерсть и я засоряю ей дом в котром живу");
    }

    @Override
    public void imHaveSpine() {
        System.out.println("У меня есть позвончник и он гбкий");
    }

    @Override
    public void info() {
        System.out.println("Я кошка " + name);
        super.milk();
        imHaveWool();
        imHaveSpine();
        System.out.println("\n");
    }
}
