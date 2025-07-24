package DZ1.Animal.some_animal;

import DZ1.Animal.Animal;
import DZ1.Animal.interfaces.IWoter;

public class Fish extends Animal implements IWoter {

    public Fish(String animalName) {
        super(animalName);
    }

    @Override
    protected void info() {
        System.out.println("Рыба "+ name);
        imLivingIn();
    }

    @Override
    public void imLivingIn() {
        System.out.println("Я живу в воде, буль");
    }
}
