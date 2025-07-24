package DZ1.Animal.some_animal;

import DZ1.Animal.Mammals;
import DZ1.Animal.interfaces.IWoter;

public class Whale extends Mammals implements IWoter {

    public Whale(String animalName) {
        super(animalName);
    }

    public void imLivingIn() {
        System.out.println("Я живу в воде, буль");
    }

    @Override
    public void imHaveSpine() {
        System.out.println("У меня есть позвоночик и он огромный");
    }

    @Override
    public void info() {
        System.out.println("Я кит " + name);
        super.milk();
        imLivingIn();
        imHaveSpine();
        System.out.println("\n");
    }
}
