package ru.ar.ex1.model;

public class Cat {
    String name;

    public String getName() { return name; }

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.printf("%s is meowing...\n", getName());
    }
}
