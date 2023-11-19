package ru.ar.ex1.model;

public class Dog {
    String name;

    public String getName() { return name; }

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.printf("%s is barking...\n", getName());
    }
}
