package ru.ar.ex1.model;

public class Donkey {
    String name;

    public String getName() { return name; }

    public Donkey(String name) {
        this.name = name;
    }

    public void ia() {
        System.out.printf("%s is saying ia-ia-iaa!\n", getName());
    }
}
