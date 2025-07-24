package org.example;

import DZ1.Animal.some_animal.Bear;
import DZ1.Animal.some_animal.Cat;
import DZ1.Animal.some_animal.Whale;
import DZ1.Transport.some_transport.Airplane;

public class Main {
    public static void main(String[] args) {
        Bear misha = new Bear("Миша");
        Cat murka = new Cat("Мурка");
        Whale igor = new Whale("Игорь");

        misha.info();
        murka.info();
        igor.info();

        Airplane boing = new Airplane("Boing");
        boing.info();
    }
}