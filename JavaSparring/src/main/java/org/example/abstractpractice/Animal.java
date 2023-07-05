package org.example.abstractpractice;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {

    }

    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
