package org.example.abstractpractice;

public class Cat extends Animal implements AnimalBehaviour {

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void breath() {
        System.out.println("*breathing sound");
    }

    @Override
    public void run() {
        System.out.println("Zoomies");
    }
}
