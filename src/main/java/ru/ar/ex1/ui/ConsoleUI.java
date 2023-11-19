package ru.ar.ex1.ui;

import ru.ar.ex1.model.Cat;
import ru.ar.ex1.model.Dog;
import ru.ar.ex1.model.Donkey;

public class ConsoleUI {
    public void start(){
        Dog dog = new Dog("Barbos");
        Donkey donkey = new Donkey("Oslik");
        Cat cat = new Cat("Pushok");

        dog.bark();
        donkey.ia();
        cat.meow();
    }
}
