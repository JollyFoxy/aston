package DZ1.Animal;

import DZ1.Animal.interfaces.ISpine;

public abstract class Mammals extends Animal implements ISpine {

    public Mammals(String animalName) {
        super(animalName);
    }

    public void milk(){
        System.out.println("В детстве питался молоком");
    }
}
