package org.example;

import org.example.abstractpractice.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Orugo", 1,"Raza");
        cat.makeNoise();
        System.out.println("Hello world! let me show you my cat he is " + cat.getName() +
                " , and he is " + cat.getAge() + " years old. He loves to eat " + cat.getFoodOfPreference());
    }
}